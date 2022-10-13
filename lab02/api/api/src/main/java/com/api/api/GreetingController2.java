/*package com.api.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController2 {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting1 greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting1(counter.incrementAndGet(), String.format(template, name));
	}
}*/