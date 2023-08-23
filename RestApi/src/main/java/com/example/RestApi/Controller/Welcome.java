package com.example.RestApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Welcome {


    @GetMapping("/welcome")
        public String Welcome(){

            return  "welcome to the first api";
        }


}
