package com.brilliant;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShortenUrlController {
	
	@GetMapping("/")
	public String loadIndex() {
		return "index";
	}

}
