package com.example.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@SpringBootApplication
	@RestController("/groupservices")
	public class Application {
	
	  @RequestMapping("/getgroup")
	  public String home() {
		return "Hello Docker World this is grp1";
	  }
	
	  public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	  }
	
}
