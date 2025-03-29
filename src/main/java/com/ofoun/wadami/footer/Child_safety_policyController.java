package com.ofoun.wadami.footer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Child_safety_policyController {
	
	@GetMapping("/child-safety-policy")
	public String showPrivacyForm() {
		
		return "child-safety-policy";		
	}

}
