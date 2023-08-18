package com.Day_1_classwork.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_2 {
	@Value("${name}")
	private String name;
	
	@GetMapping("ex2")
	public String getName()
	{
		return "Welcome "+name+"!";
	}
}
