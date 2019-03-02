package com.xumou.project.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.xumou.project.em.mapper.TestMapper;

@Controller
public class GotoController {
	
	@Autowired
	TestMapper testMapper;
	
	@GetMapping("test")
	public void test(){
		System.out.println(testMapper.selectDual());
	}
	
}
