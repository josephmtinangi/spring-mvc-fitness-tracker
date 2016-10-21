package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jsoftwares.model.Goal;

@Controller
@RequestMapping(value = "goals")
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		return "goals/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Goal goal) {

		System.out.println("Minutes updated: " + goal.getMinutes());

		return "redirect:../minutes/add";
	}
}
