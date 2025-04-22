//package com.example.controller;
//import com.example.dto.SignUpDTO;
//import com.example.entity.SignUpPage;
//import com.example.repositry.SignUpRepo;
//import com.example.service.SignUpService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//    @RestController
//    @RequestMapping
//    public class SignUpController {
//
//        @Autowired
//        private SignUpService signUpService;
//
//        @Autowired
//        private SignUpRepo signUpRepo;
//
//
//        @PostMapping("/save")
//        public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpDTO dto) {
//
//            if (!dto.getPassword().equals(dto.getConfirmPassword())) {
//                return ResponseEntity.badRequest().body("Password and Confirm Password do not match");
//            }
//
//            if (signUpRepo.findByUsername(dto.getUsername()).isPresent()) {
//                return ResponseEntity.badRequest().body("Username already exists");
//            }
//
//            if (signUpRepo.findByEmail(dto.getEmail()).isPresent()) {
//                return ResponseEntity.badRequest().body("Email already exists");
//            }
//
//            SignUpPage user = new SignUpPage();
//            user.setUsername(dto.getUsername());
//            user.setEmail(dto.getEmail());
//            user.setPassword(dto.getPassword());
//            user.setConfirmPassword(dto.getConfirmPassword());
//            user.setMobile(dto.getMobile());
//
//            signUpService.register(user);
//            return ResponseEntity.ok("User registered successfully");
//        }
//
//    }
package com.example.controller;

import com.example.dto.SignUpDTO;
import com.example.entity.SignUpPage;
import com.example.service.SignUpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/save")
    public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpDTO dto) {
        signUpService.register(dto);
        return ResponseEntity.ok("User registered successfully");
    }
}

