package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/about")
public class AboutController {
	
	@RequestMapping(value="/the-team")
	public String theTeam(Model model)
	{
		model.addAttribute("title", "The Team");
		return "the-team";
	}
}
