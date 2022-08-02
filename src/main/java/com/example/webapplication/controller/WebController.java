package com.example.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapplication.service.WebService;

@RestController
@RequestMapping("/Web")
public class WebController {
	

		
		
		@Autowired
		private WebService service;
		@GetMapping("/display")
		public String display() {
			return "Page Is Working properly!!!!!!!";
		}
		
		@GetMapping("/displayService")
		public String serviceDisplay() {
			return service.display();
		}

}
