package com.javacodegeeks.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Java Code Geeks!";
	}
	@GetMapping("hi")
	public String hi() {
		return "Hi JAVA..56";
	}

	@GetMapping("good")
	public String good(){
		return "Good work, you are practicing as promised..Keep it up.."
	}
