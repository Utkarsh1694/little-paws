package com.pet.me.logincontroller;

import com.pet.me.entities.User;
import com.pet.me.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping({"/signup", "signup"})
    public String signUpUser(@RequestParam("email") String email) {

        //check if user exists
        User user = userRepository.findByEmailId(email);

        //if user exists then display an error message saying email id registered already
        if (user == null)
            return "signup";

        //add the user info to the database

         //go to home page
            return "home";

    }


        @GetMapping({"", "/", "login", "login.html"})
        public String getForm (User user) {

            System.out.println("IN GET MAPPING");
            return "login";
        }

    @PostMapping({"", "/", "login", "login.html"})
    public String postForm (User user) {

        System.out.println("IN POST MAPPING");
        String email = user.getEmail();
        String pass = user.getPassword();

        System.out.println("email:"+email);
        System.out.println("pass:"+pass);

        User us = new User(email, pass);

        userRepository.save(us);
        System.out.println("*********************************i am here");
        return "home";
    }

    }
