package com.example.demo.app.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.app.entity.view.View;
import com.example.demo.app.service.view.ViewService;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	private ViewService viewService;
	
	@Autowired
	public ViewController(ViewService viewService) {
		this.viewService = viewService;
	}
	
	
	@GetMapping
	public String init(Model model) {
		List<View> view = viewService.getAll();
		model.addAttribute("title", "View title");
		model.addAttribute("viewList", view);
		return "view/index";
	}
}
