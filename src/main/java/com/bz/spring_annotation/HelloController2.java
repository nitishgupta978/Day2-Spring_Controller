package com.bz.spring_annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HelloController2 {
    @GetMapping("/hello")
    //@RequestMapping(method=RequestMethod.Get)
    public String sayHello(){
        return "Hello John";
    }
    @GetMapping("/say")
    //@RequestMapping(method=RequestMethod.Get)
    public String sayBy() {
        return "Hello Wick you Good!!";
    }
}
