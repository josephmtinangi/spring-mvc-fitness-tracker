package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/about")
public class AboutController {
	
	@RequestMapping(value="/the-team")
	public String theTeam()
	{
		return "the-team";
	}
}
