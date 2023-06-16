package com.adith.smartcontactmanager.controller;

import com.adith.smartcontactmanager.entities.User;
import com.adith.smartcontactmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserRepository userRepository;

//    @GetMapping("/dashboard")
//    public List<User> adminPanel(){
//        List<User> list= userRepository.findAll();
//        return list;
//    }
    @GetMapping("/dashboard")
    public String adminPanel(Model model, Principal principal){

        String username=principal.getName();
        User user=userRepository.findUserByEmail(username);
        model.addAttribute("user",user);
        return "admin/adminPanel";
    }

    @PostMapping("/adduser")
    public String adduser(){

        return "admin/adminPanel";
    }

    @PutMapping("/updateUser")
    public String updateUser(){

        return "admin/adminPanel";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){

        return "admin/adminPanel";
    }



}
