package com.jz.education.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value="/index")
public class Controller {

	@RequestMapping(value="/web")
	public String index(){
		return "fileup";
	}
}
