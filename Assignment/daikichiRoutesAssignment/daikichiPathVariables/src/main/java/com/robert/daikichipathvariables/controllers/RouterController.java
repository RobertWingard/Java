package com.robert.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class RouterController {
	
	@RequestMapping("/daikichi/{city}")
		public String city(@PathVariable("city") String city) {
		return "Congrats! You will soon travel to "+ city;
	}
	
	@RequestMapping("/daikichi/lotto/{number}")
		public String lotto(@PathVariable("number") Integer number) {
		if (number%2==1) {
		return "The odd number "+number  +" is good for hope";
		}else {
		return "The even number " +number +" is good for health";
		}
	}
}
