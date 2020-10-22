package com.sandbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sandbox.service.TestServiceImpl;

@RestController
public class BatchController {
	@Autowired
	TestServiceImpl serviceTest;

	@GetMapping("/hello")
	String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/insert")
	public String insertTestObjects(@RequestParam(value = "codeRe", required = false) String codeRe) {
		boolean response = serviceTest.insertTestObjectFromCodeRe(codeRe);
		return response ? "Insertion réalisé" : "Echec Insertion";
	}
}
