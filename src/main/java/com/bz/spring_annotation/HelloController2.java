package com.bz.spring_annotation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController2 {
    @GetMapping("/message")
    //@RequestMapping(method=RequestMethod.Get)
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
//    @GetMapping("/say")
//    //@RequestMapping(method=RequestMethod.Get)
//    public String sayBy() {
//        return "Hello Wick  Good luck !!";
//    }
    //UC2
//    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
//    public String sayHellojohn(@PathVariable String name){
//        return "Hello"+name+"!";
//    }
}
