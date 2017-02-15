package com.kidzactivities.kidzweb.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActivityController {

	@RequestMapping("/")
	@ResponseBody
	public String activity()
	{
		return "New activity setup";
	}
	
}
