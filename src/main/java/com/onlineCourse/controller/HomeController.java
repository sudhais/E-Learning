package com.onlineCourse.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Data
@RestController
@Slf4j
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home");
		log.info("Enter in Home!");
		return "index";

	}
	@GetMapping("/search")
	public String search(Model model) {
		model.addAttribute("title", "search");
		log.info("Enter in search!");
		return "search";
	}
	@GetMapping("/abdur")
	public String abdur(Model model) {
		model.addAttribute("title", "search");
		log.info("Enter in about!");
		return "about";
	}
	@GetMapping("/responsive")
	public String responsive(Model model) {
		model.addAttribute("title", "search");
		log.info("Enter in about!");
		return "responsive-index";
	}


	}


