
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ui")
public class UiController {
	@GetMapping("/")
	public String sayHello(Model model) {
		String pageName = "Hello To The SpringBoot World";
		model.addAttribute("k_message", "This message from Controller");
		return pageName;
	}

}
