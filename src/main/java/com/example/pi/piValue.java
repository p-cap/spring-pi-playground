package com.example.pi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class piValue {
    //the value of PI
    @GetMapping("/pi")
    public String getPi() {
        return "3.141592653589793";
    }
}
