package com.sandbox;

import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BatchController {
	@RequestMapping("/hello")
	String hello() {
		return "Hello";
	}

}
