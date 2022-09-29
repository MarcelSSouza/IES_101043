package com.ipmaapiclient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App 
{
    public static Logger logger= Logger.getLogger(App.class.getName());
    //todo: should generalize for a city passed as argument
    private static final String CITY_ID_AVEIRO = System.getProperty("exec.city_name"); //Para acessar as propriedades do Maven, é necessário usar o System.getProperty juntamente com o exec. + nome da propriedade que queremos acessar.
    public static void main( String[] args )
    {
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("http://api.ipma.pt/open-data/")
        .addConverterFactory(GsonConverterFactory.create()) //Tive problemas com esta linha. Ao final, tive que adicionar a dependência do GsonConverterFactory no pom.xml
        .build();

// create a typed interface to use the remote API (a client)
IpmaService service = retrofit.create(IpmaService.class);

//ipmaservice cannor be used directly, it needs to be called. How to call it?
// prepare the call to remote endpoint
Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

try {
    Response<IpmaCityForecast> apiResponse = callSync.execute();
    IpmaCityForecast forecast = apiResponse.body();

    if (forecast != null) {
        CityForecast firstDay = forecast.getData().listIterator().next();
        logger.log(Level.INFO, "Starting Weather App");
        System.out.printf( "max temp for %s is %4.1f %n",
                firstDay.getForecastDate(),
                Double.parseDouble(firstDay.getTMax()));
            logger.log(Level.INFO, "LOGGING CONSOLE: max temp for {0} is {1}",
           new Object[] { firstDay.getForecastDate(), Double.parseDouble(firstDay.getTMax())});
    } else {
        System.out.println( "No results for this request!");
        logger.log(Level.WARNING, "No results for this request!");

    }
} catch (Exception ex) {
    logger.log(Level.SEVERE, "Exception: {0}", ex.getMessage());
}
    }
}
