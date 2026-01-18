package com.springboot.aiconversational.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    @GetMapping()
    public String HelloWord(){
        return "Hello World";
    }

}
