package com.jonathan.controllerportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "myproject.html";
	}
	@RequestMapping("/me")
	public String aboutme() {
		return "me.html";
	}
}
