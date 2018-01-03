package com.pc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	// Metodo para enlazar con la vista
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}

}
