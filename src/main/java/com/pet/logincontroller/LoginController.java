package com.pet.logincontroller;

import com.pet.entities.User;
import com.pet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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


        @RequestMapping(value = {"/login", "login"}, method = RequestMethod.POST)
        public String login () {

            //check if user creds are valid or not


            return "home";
        }

    }
