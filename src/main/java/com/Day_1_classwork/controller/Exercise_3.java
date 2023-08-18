package com.Day_1_classwork.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_3 {
	@Value("${yourFavColor}")
	private String yourFavColor;
	
	@GetMapping("ex3")
	public String getMyFav()
	{
		return "My favorite color is "+yourFavColor+"!";
	}
}

