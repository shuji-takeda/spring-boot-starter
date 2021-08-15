package com.example.demo.app.band;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/band")
public class BandContoroller {
	@GetMapping("/form")
	public String form(Model model) {
		System.out.println("this is band/form");
		model.addAttribute("title" , "Band");
		return "band/form";
	}
}
