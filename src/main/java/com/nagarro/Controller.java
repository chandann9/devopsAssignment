package com.nagarro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/home")
	public String getApi()
	{
		return "hello";
	}

}
