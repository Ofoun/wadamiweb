package com.ofoun.wadami.footer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Terms_of_serviceController {
	
	@GetMapping("/terms-of-service")
	public String showTermsOfService() {
		
		return "/terms-of-service";		
	}

}
