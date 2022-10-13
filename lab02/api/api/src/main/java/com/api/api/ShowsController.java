package com.api.api;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowsController {
ShowsDB showsDB;

    @GetMapping("/quote")
    public HashMap<Integer, String> getAnyquote() {  
        return showsDB.getAnyQuote();
    }
    @GetMapping("/shows")
    public HashMap getAllShows() {
        return showsDB.getAllShows();
    }

    @GetMapping("/shows/{id}")
    public ShowsDB getShowById(@RequestParam(value = "id", defaultValue = "1") String id) {
        return showsDB.getShowById(Integer.parseInt(id));
    }
    public static void main(String[] args) {
        ShowsDB showsDB = new ShowsDB( "Friends",1, "I'll be there for you");
        ShowsDB showsDB2 = new ShowsDB( "Friends",1, "We were on a break"); 
        ShowsDB showsDB3 = new ShowsDB( "Friends",1, "Could I BE any more excited?");
        ShowsDB showsDB4 = new ShowsDB("The Office", 2, "I'm not superstitious, but I am a little stitious");
        ShowsDB showsDB5 = new ShowsDB("Parks and Rec",3,  "I love you, and I like you" );
        ShowsDB showsDB6 = new ShowsDB("Parks and Rec",3,  "I'm not a regular mom, I'm a cool mom"  );
    }
}
