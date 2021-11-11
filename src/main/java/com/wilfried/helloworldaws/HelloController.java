package com.wilfried.helloworldaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/grettings")
    public String helloGreetings(){
        return "Bonjour Mr ";
    }

    @GetMapping(path = "/path-variable/{name}")
    public HelloBean greetings(@PathVariable String name){
        return new HelloBean("Wilfried te dit : Bonjour => " + name);
    }
}
