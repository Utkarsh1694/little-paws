package com.pet.logincontroller;

import com.pet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping{"/signup", "signup"}
    public String signUpUser(){

        //check if user exists
        boolean exists = userRepository.findByEmailId(email);

        //if user exists then display an error message saying email id registered already


        //if user does not exist then add the cred to DB and show the landing page for the user

    }

    @RequestMapping({"/login", "login"})
    public String login(){

        //check if user creds are valid or not



        return "login";
    }

}
