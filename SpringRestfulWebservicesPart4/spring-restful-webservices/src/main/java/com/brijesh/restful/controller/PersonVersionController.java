package com.brijesh.restful.controller;

import com.brijesh.restful.beans.Name;
import com.brijesh.restful.beans.PersonV1;
import com.brijesh.restful.beans.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

    @GetMapping("v1/person")
    public PersonV1 personV1(){
        return new PersonV1("Tommy Peaky");
    }

    @GetMapping("v2/person")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Thomas","Shelby"));
    }

    @GetMapping(value = "/person/param", params="version=1")
    public PersonV1 paramV1(){
        return new PersonV1("Tommy Peaky");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    public PersonV2 paramV2(){
        return new PersonV2(new Name("Thomas","Shelby"));
    }


}
