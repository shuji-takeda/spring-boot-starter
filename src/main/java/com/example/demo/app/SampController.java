package com.example.demo.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampController {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public SampController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@GetMapping
	public String test(Model model) {
		System.out.println("Init");
		String sql= "select id , bandName from band where id=1";
		Map<String , Object> map = jdbcTemplate.queryForMap(sql);
		
		model.addAttribute("title", "サンプルだぞ");
		model.addAttribute("bandName", map.get("bandName"));
		return "index";
	}
}
