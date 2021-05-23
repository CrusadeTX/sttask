package com.project.sttask;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

@RestController
public class GreetingController {
	
@GetMapping(path="/greeting")
public String retrieveGreeting() {
	LocalDateTime currentDateTime = LocalDateTime.now();
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedDateTime = currentDateTime.format(dateTimeFormatter);
	return "Greetings Visitor! The current date and time is: "+ formattedDateTime;
}

}
