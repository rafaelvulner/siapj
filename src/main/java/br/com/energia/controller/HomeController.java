package br.com.energia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("ola")
	public String home(){
		
		return "Alive";
	}

}
