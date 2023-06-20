package com.adith.smartcontactmanager.controller;

import com.adith.smartcontactmanager.entities.User;
import com.adith.smartcontactmanager.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    public SearchController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;


    //search Handler
    @GetMapping("admin/dashboard/search/{query}")
    public ResponseEntity<List<User>> search(@PathVariable("query")String query){

        List<User>list=userRepository.findByUserNameContaining(query);

        return ResponseEntity.ok(list);

    }
}
