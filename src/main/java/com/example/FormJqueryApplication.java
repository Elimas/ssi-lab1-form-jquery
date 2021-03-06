package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class FormJqueryApplication {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(FormJqueryApplication.class, args);
	}
}
