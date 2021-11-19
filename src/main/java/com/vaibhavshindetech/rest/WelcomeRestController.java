package com.vaibhavshindetech.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vaibhav
 *
 */
@RestController
public class WelcomeRestController {
	@GetMapping(value = { "/welcome" })
	public String welcomeMsg() {
		return "Welcome to VaibhavShindeTech";
	}
}
