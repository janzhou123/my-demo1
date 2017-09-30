package com.myexample.mydemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemo1Controller {

    @GetMapping("/get")
    public String hello(){
        return "hello world";
    }
}
