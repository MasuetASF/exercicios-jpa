package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimieroController {

	@GetMapping(path = { "/ola" , "saudacao"})
	public String ola() {
		return "Olá Mundo";
	}
}
