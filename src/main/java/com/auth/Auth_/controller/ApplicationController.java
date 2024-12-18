package com.auth.Auth_.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok(" Welcome the programm is worked");
    }

    @GetMapping("/Contact us")
    public ResponseEntity<String> saycontact(){
        return ResponseEntity.ok("this is for contact- 9657256729");
    }
}
