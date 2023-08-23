package com.example.fienClient.Controller;

import com.example.fienClient.interfac.WelcomeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

        @Autowired
        private WelcomeApiClient welcomeApiClient;

        @GetMapping("/greet")
        public String greetMsg(){

            String greetMsg = "Welcome";
            String welcomeMsg=welcomeApiClient.invokeWelcomeApi();
            return welcomeMsg+greetMsg;
        }
}
