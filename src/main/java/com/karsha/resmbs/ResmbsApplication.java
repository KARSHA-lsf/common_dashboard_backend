package com.karsha.resmbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@RestController
@SpringBootApplication
@EnableSwagger2
public class ResmbsApplication  extends SpringBootServletInitializer {

	@RequestMapping("/")
	String home() {
		return "Hello resMBS!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ResmbsApplication.class, args);
	}


}
