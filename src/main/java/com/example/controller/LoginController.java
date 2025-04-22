
package com.example.controller;

import com.example.dto.LoginDto;
import com.example.entity.UserLogin;
import com.example.entity.SignUpPage;
import com.example.repositry.SignUpRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private SignUpRepo signUpRepo;

    @PostMapping("/login")
    public ResponseEntity<LoginDto> login(@RequestBody UserLogin user) {
        Optional<SignUpPage> userOptional = signUpRepo.findByUsername(user.getUsername());

        if (userOptional.isPresent()) {
            SignUpPage registeredUserSignUpPage = userOptional.get();

            if (registeredUserSignUpPage.getUsername().equals(user.getUsername()) && registeredUserSignUpPage.getPassword().equals(user.getPassword())) {
                return new ResponseEntity<>(new LoginDto("Login successful", true), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new LoginDto("Invalid password", false), HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>(new LoginDto("User not found", false), HttpStatus.NOT_FOUND);
        }
    }
}



