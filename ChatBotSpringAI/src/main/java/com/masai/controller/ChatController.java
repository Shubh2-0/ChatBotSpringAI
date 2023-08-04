package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.OpenAiService;

@RestController
public class ChatController {

	@Autowired
	private OpenAiService openAiService;
	
	@GetMapping("/mychat")
	public String openAiHandeller(@RequestParam("userInput") String userInput) {
		
	return openAiService.OpenAiSericeCall(userInput);	
		
	}
	
	
	
}
