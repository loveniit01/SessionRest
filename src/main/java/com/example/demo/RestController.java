package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/", produces = "application/json")
	public Map<String, String> helloUser(@RequestParam String x) {
		HashMap<String, String> result = new HashMap<>();
		result.put("username", x);
		return result;
	}

	@RequestMapping("/logout")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void logout() {
System.out.println("== ho ja na logout");		
//		session.invalidate();
	}

}
