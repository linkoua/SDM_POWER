package com.sandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController {
	@GetMapping("/hello")
	String hello() {
		return "Hello World";
	}

}
