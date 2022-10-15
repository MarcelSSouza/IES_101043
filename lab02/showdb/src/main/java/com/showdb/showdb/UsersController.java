package com.showdb.showdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
  public List<Show> list = new ArrayList<Show>();

  public UsersController() {
    list.add(new Show(1, "The Office", "I'm not superstitious, but I am a little stitious.", 1));
    list.add(new Show(2, "The Office",
        "I wish there was a way to know you're in the good old days before you've actually left them.", 1));
    list.add(new Show(3, "The Office", "Bears. Beets. Battlestar Galactica.", 1));
    list.add(new Show(4, "The Office", "I declare bankruptcy!", 1));
    list.add(
        new Show(5, "The Office", "Identity theft is not a joke, Jim! Millions of families suffer every year!", 1));
    // friends quotes
    list.add(new Show(6, "Friends", "We were on a break!", 2));
    list.add(new Show(7, "Friends", "Could I BE wearing any more clothes?", 2));
    list.add(new Show(8, "Friends", "I'm not so good with the advice. Can I interest you in a sarcastic comment?", 2));
    // Family guy quotes
    list.add(new Show(9, "Family Guy", "I'm not even supposed to be here today!", 3));
    list.add(new Show(10, "Family Guy", "I'm not fat, I'm big boned!", 3));
    list.add(new Show(11, "Family Guy", "I'm Peter, and this is my favorite store.", 3));
    list.add(new Show(12, "Family Guy", "I'm not drunk, I'm from Ireland.", 3));
  }

  @GetMapping("/shows")
  public List<Show> getQuote() {
    return list;
  }

  @GetMapping("/quote")
  public Show getRandomQuote() {
    // random number from 0 to the size of the list
    int random = (int) (Math.random() * list.size());
    // return the random quote
    return list.get(random);
  }


  @GetMapping("/quotes")
  public Show getRandomQuoteFromShow(@RequestParam Integer show_id) {
    List<Show> showList = new ArrayList<Show>();
    for (Show show : list) {
      if (show.show_id == show_id) {
        showList.add(show);
      }
    }
    int random = (int) (Math.random() * showList.size());
    return showList.get(random);
  }


}