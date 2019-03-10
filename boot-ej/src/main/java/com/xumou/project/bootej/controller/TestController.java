package com.xumou.project.bootej.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("test1")
	public Object test1(){
		return "abc('SUCCESS')";
	}
	
	@GetMapping("test2")
	public Object test2(){
		return "abc('哈哈哈哈哈哈')";
	}
	
	@PostMapping("test3")
	public Object test3(){
		return "abc('post也可以')";
	}
	
}
