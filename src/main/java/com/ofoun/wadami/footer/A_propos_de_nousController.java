package com.ofoun.wadami.footer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A_propos_de_nousController {
	
	
	@GetMapping("/aProposDeNous")
	public String showAProposDeNousForm() {
		
		return "a_propos_de_nous";		
	}

}
