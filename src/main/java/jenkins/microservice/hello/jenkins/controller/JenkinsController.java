package jenkins.microservice.hello.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/hello")
    public String greetingsJenkins(){
        return "Welcome to jenkins";
    }

    @GetMapping("/faheem")
    public String greetingsFaheem(){
        return "Hello Faheem";
    }
}
