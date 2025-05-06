package com.example.controller;
//package com.example.controller;
//
//import com.example.dto.SignUpDTO;
//import com.example.entity.SignUpPage;
//import com.example.service.SignUpService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping()
//public class SignUpController {
//
//    @Autowired
//    private SignUpService signUpService;
//
//    @PostMapping("/save")
//    public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpDTO dto) {
//        signUpService.register(dto);
//        return ResponseEntity.ok("User registered successfully");
//    }
//}
//


import com.example.dto.SignUpDTO;
import com.example.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody SignUpDTO dto) {
        signUpService.register(dto);
        return ResponseEntity.ok("User registered successfully");
    }
}
