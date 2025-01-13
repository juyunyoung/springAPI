package com.gsenc.chatbot.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.mapping.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsenc.chatbot.service.ChatbotAPIService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class ChatbotAPIControlledr {
	@Autowired
	private ChatbotAPIService chatbotAPIService;

	
	@GetMapping("/index")
	public String index() {		
		return "index";
	}
	
	@GetMapping("/list")	
	public ResponseEntity list(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView) {
		List<Map> list = chatbotAPIService.getTotalList(null);
		
        return new ResponseEntity<>(list, HttpStatus.OK);
		
	}

}
