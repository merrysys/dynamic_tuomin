package com.dynamic.tuomin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping(value="test")
	public String test(
			String replaceText
			){
		
		return "test";
	}
}
