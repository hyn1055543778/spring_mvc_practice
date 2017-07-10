package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.MsgService;

@Controller
@RequestMapping(value="/")
public class HelloController {
	@Autowired
	@Qualifier("msgServiceImpl")
	private MsgService service;

	@RequestMapping(value="/service", method=RequestMethod.GET)
	@ResponseBody
	public String getServiceString() {
		System.out.println("HelloController.getServiceString()");
		if (service == null)
			return "service is null,can not service!";
		return service.getMsg();
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
//		System.out.println("ddd");
		return "resultPage";
	}
	
}
