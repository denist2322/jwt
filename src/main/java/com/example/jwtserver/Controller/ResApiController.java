package com.example.jwtserver.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResApiController {
    @RequestMapping("/home")
    public String home(){
        return "<h1>home</h1>";
    }
}
