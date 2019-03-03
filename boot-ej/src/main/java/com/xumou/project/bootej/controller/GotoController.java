package com.xumou.project.bootej.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xumou.project.bootej.repository.UserRepository;

@Controller
public class GotoController {
	
	@Autowired
	UserRepository userRepository;
	
	@ResponseBody
	@GetMapping("test")
	public Object test(){
		return userRepository.findAll();
	}
	
}
