package com.Day_1_classwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_1 {
	@GetMapping("ex1")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}
}