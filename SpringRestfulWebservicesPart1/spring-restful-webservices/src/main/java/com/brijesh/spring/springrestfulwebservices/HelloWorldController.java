package com.brijesh.spring.springrestfulwebservices;

import com.brijesh.spring.pojo.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

//controller
@RestController
public class HelloWorldController {

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
}
