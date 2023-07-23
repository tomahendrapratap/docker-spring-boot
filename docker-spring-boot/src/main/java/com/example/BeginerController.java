package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeginerController {

	@GetMapping("/hello")
    public String home() {
            return "Hello World!";
    }
}
