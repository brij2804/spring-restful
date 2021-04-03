package com.brijesh.restful.controller;

import com.brijesh.restful.beans.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//controller
@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    //GET
    //URI - /hello-world
    //method - "Hello-World"
    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world2")
    public String helloWorld2(){
        return "Hello World2";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s",name));
    }

    @GetMapping(path = "/hello-world-international")
    public String helloWorldInternational(@RequestHeader(name="Accept-Language") Locale locale){
        return messageSource.getMessage("good.morning.message",null,locale);
    }
}
