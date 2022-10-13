package com.api.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowsController {

    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/quote")
        //return a quote from any show in the database

    @GetMapping("/shows")
        //return a show from the database

}
