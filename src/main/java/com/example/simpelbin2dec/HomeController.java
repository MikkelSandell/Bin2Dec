package com.example.simpelbin2dec;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping()
    public String start(){
        return "index";
    }

}
