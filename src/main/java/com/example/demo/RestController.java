
package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.model.Login;
import com.example.demo.repo.Connect2Table;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/", produces = "application/json")
	public Map<String, String> helloUser(@RequestParam  String x) {
		HashMap<String, String> result = new HashMap<>();
		result.put("username", x);
		
		List<Object> ll = ct.connect();
		System.out.println("~~~~controller = = = "+ll);
		
		
		return result;
	}
	@RequestMapping(value = "/pj", produces = "application/json")
	public ResponseEntity<?> helloUser1(@RequestParam  String x) {
		
		HashMap<String, String> result = new HashMap<>();
		result.put("username", x);
		
		List<Object> ll = ct.connect();
		System.out.println("~~~~controller = = = "+ll);
		
		for(int i= 0; i<ll.size(); i++) {
			Object[]oo=(Object[]) ll.get(i);
		result.put("id",(oo[0].toString()));
		result.put("name",oo[1].toString());
		result.put("password",oo[2].toString());
		}
		return	ResponseEntity.status(HttpStatus.ACCEPTED).header("MyResponseHeader", "MyValue").body(result);

	}

	@RequestMapping("/logout")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void logout() {
		System.out.println("== ho ja na logout");
//		session.invalidate();
	}

	@Autowired
	Connect2Table ct;
}

