package com.boraji.tutorial.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@GetMapping("/getcall")
	public @ResponseBody Map getCustomer() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "sameer");
		m.put("age", "21");
		m.put("add", "gurgaon");
		return m;
	}

	@RequestMapping(value = "/team", method = RequestMethod.GET)
	public @ResponseBody Map message() {// REST Endpoint.
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "sameer");
		m.put("age", "21");
		m.put("add", "gurgaon");
		return m;
	}

}
