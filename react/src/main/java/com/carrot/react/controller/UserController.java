package com.carrot.react.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrot.react.service.UserService;

@RestController
public class UserController {
	@Autowired private UserService us;
	
	@GetMapping("/")
	public String getHome() {
		return "Hello world~ 현재시간은 "+new Date()+"입니다.";
	}
	
	@GetMapping("/userhome")
	public String getHome2() {
		return "?????"+new Date();
	}
	
	
}
