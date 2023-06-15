package com.adith.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/dashboard")
    public String  userDashboard(Model model, Principal principal){
        String name = principal.getName();
        System.out.println(name);
        return"user/userDashboard";
    }

}
