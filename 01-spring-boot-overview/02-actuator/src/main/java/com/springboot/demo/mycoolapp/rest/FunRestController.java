package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
  // expose "/" that returns "Hello World!"
	@GetMapping("/")
	public String sayHello(){
		return "Hello World!";
	}
	
	//expose a endpoint for "/Workout"
	
	@GetMapping("/workout")
	public String getdailyworkout() {
		return "Get cleared!";
	}
	
	//expose a endpoint for "/fortune"
	
	@GetMapping("/fortune")
	public String getdailyfortune() {
		return "Get a fortunted life!";
	}
}
