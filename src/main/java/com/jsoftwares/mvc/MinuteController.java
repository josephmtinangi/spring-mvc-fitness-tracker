package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/minutes")
public class MinuteController {

	@RequestMapping(value="/add")
	public String add()
	{
		return "minutes/add";
	}
}
