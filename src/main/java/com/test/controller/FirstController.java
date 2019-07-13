package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstController.class);
	@RequestMapping("/show")
	public String show() {
		logger.info("Inside Controller");
		System.out.println("i am here");
		return "index";
	}

}
