package com.example.dockerpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class TestController {

    @GetMapping("hello")
    public String testMethod(){

        return "Hello from ECS by CodePipeline";
    }



}
