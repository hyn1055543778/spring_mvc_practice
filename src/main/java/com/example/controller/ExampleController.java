package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exam")
public class ExampleController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	@ResponseBody
	public String exam() {
		System.out.println("ExampleController.exam()");
		return "example";
	}

}
