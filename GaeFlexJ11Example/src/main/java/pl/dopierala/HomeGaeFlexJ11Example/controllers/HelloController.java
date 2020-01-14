package pl.dopierala.HomeGaeFlexJ11Example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from GaeExtdTest J8";
    }
}
