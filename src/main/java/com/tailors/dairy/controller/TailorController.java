package com.tailors.dairy.controller;

import com.tailors.dairy.model.Tailor;
import com.tailors.dairy.service.TailorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TailorController {
	@Autowired
	private TailorService tailorService;


	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("tailor", new Tailor());
		return "register";
	}

	@PostMapping("/register")
	public String registerTailor(@ModelAttribute Tailor tailor, Model model) {
		if (tailorService.isPhonTaken(tailor.getPhone())) {
			model.addAttribute("error", "Phone already in use");
			return "register";
		}

		tailorService.registerTailor(tailor);
		model.addAttribute("message", "Registration successful!");
		return "login";
	}
}
