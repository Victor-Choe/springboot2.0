package com.victor.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class HomeController {
	

	@RequestMapping("/index")
	public String adsdf() {
		return "hello";
	}
	@RequestMapping("/index1")
	public String adsdf1() {
		return "hello12312";
	}
}
