package com.vote_application.voteapp.web.controller;

import com.vote_application.voteapp.model.User;
import com.vote_application.voteapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserServiceImpl userServiceImpl;
    private boolean authenticated;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("alluserlist", userServiceImpl.getAllUser());
        return "login";
    }

    @GetMapping("/adduser")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userServiceImpl.save(user);
        return "redirect:/";
    }


    @PostMapping("/login")
    public String login(@RequestParam String firstName, @RequestParam String Password) {
        // authenticate user credentials here
        if (authenticated) {
            // redirect to home page
            return "home";
        } else {
            // handle invalid credentials
            return "login";
        }
    }




}
