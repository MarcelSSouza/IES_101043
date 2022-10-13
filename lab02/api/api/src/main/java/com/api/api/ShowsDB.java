package com.api.api;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShowsDB {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String show_name;
    private int show_id;
    private String quote;

    // constructor
    public ShowsDB(String show_name, int show_id, String quote) {
        this.show_name = show_name;
        this.show_id = show_id;
        this.quote = quote;
    }

    ShowsDB(){}; // default constructor


    // getters
    public String getShow_name() {
        return show_name;
    }

    public int getShow_id() {
        return show_id;
    }

    public String getQuote() {
        return quote;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    // toString
    @Override
    public String toString() {
        return "ShowsDB{" + "id=" + id + ", show_name=" + show_name + ", show_id=" + show_id + ", quote=" + quote + '}';
    }
   }
   

   //  public static void main(String[] args) {
     //    ShowsDB showsDB = new ShowsDB("Friends", 1, "I'll be there for you");
      //   ShowsDB showsDB2 = new ShowsDB("Friends", 1, "We were on a break");
      //   ShowsDB showsDB3 = new ShowsDB("Friends", 1, "Could I BE any more excited?");
      //   ShowsDB showsDB4 = new ShowsDB("The Office", 2, "I'm not superstitious, but I am a little stitious");
      //   ShowsDB showsDB5 = new ShowsDB("Parks and Rec", 3, "I love you, and I like you");
      //   ShowsDB showsDB6 = new ShowsDB("Parks and Rec", 3, "I'm not a regular mom, I'm a cool mom");
 


