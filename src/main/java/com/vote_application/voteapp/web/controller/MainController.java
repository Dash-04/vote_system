package com.vote_application.voteapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/onboarding")
    public String onboarding(){
        return "onboarding";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
