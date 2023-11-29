package com.ofoun.wadami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WadamiwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WadamiwebApplication.class, args);
	}
	
	
	@Controller
//	@RequestMapping("/")
	public class HomeController {
		@GetMapping("/")
		public String viewHomePage() {
						
			return "index";
			
		}
	}

}
