package com.carrot.react.controller;

import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/home")
	public String getHome() {
		return "Hello world~ 현재시간은 "+new Date()+"입니다.";
	}
	
	@GetMapping("/test")
	public String getTest() {
		JSONObject jj = new JSONObject();
		jj.put("id", 0);
		jj.put("name", "shelby");
		jj.put("age", "30");
		jj.put("phone", "010-1234-5678");
		System.out.println(jj.toString());
		return jj.toString();
	}
	
	
	@GetMapping("/test2")
	public String getTest2() {
		JSONArray jarr = new JSONArray();
		for(int i=1; i<=10; i++) {
			JSONObject jj = new JSONObject();
			jj.put("id", i);
			jj.put("name", "shelby");
			jj.put("age", "30");
			jj.put("phone", "010-1234-5678");
			jarr.add(jj);
		}
		System.out.println(jarr.toString());
		return jarr.toString();
	}
}
