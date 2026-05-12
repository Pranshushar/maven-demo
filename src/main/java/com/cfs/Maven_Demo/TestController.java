package com.cfs.Maven_Demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test()
    {
        return "🚀 Deployment Successful! | Service: maven-demo | Deployed at: 2026-05-13T02:40:00 | Pipeline: Jenkins → SonarQube → Nexus → EC2";
    }
}
