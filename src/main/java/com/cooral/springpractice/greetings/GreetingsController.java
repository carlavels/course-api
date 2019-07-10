package com.cooral.springpractice.greetings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation for Spring to recognize this class as RestController which responds to http requests
@RestController
public class GreetingsController {
	
	// Annotation for specifying the http request where this particular method responds/triggers
	@RequestMapping("/greet")
	public String greet() {
		return "<b>This page say's Hi!</b>";
	}

}
