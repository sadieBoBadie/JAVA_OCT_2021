package com.projects.awesomeProject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String hello() {
		return "<h1>Hello World</h1>";
	}
	
	@RequestMapping("/cats")
	public String cats() {
		return "meow";
	}
	
	// localhost:8080/cats/search?q=tabby
	@RequestMapping("/cats/search")
	public String catSearch(@RequestParam(value="q") String query) {
		
		return String.format("You searched for %s", query);
	}
	
	@RequestMapping("/cats/{ownerName}/{numCats}")
	public String catDesc(
			@PathVariable("ownerName") String ownerName,
			@PathVariable("numCats") Integer numCats
			) {
		return String.format("Hello %s! You have %scats!!", ownerName, numCats );
		
	}

 
}
