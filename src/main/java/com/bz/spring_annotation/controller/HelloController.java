package com.bz.spring_annotation.controller;

import com.bz.spring_annotation.User;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/message")
    //@RequestMapping(method=RequestMethod.Get)
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
    @GetMapping("/mr")
    //@RequestMapping(method=RequestMethod.Get)
    public String sayHello(@RequestParam String name) {
        return "Hello Wick  Good luck !!"+name+"From Bridgelabz";
    }
    //UC2
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam1 (@RequestParam(value="name")String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello "+firstName+" "+lastName+ " from BridgeLabz";
    }
}
