package com.example.jenkinstest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jenkins")
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<String> testJenkins() {
        return ResponseEntity.ok("I got you ;)");
    }
}
