package com.jonathan.controllerpractice.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}

//@RestController
//@RequestMapping("/hello")
//public class HomeController {
//	@RequestMapping("")
//	public String home() {
//		return "Hello World!";
//	}
//	@RequestMapping("/world")
//	public String world() {
//		return "Class level annotations are cool too!";
//	}
//}
