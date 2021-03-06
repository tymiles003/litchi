package com.litchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/{page}")
	public String showPpage(@PathVariable String page) {
		return page;
	}
}
