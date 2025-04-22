package com.example.controller;



import com.example.dto.ForgotPasswordDto;
import com.example.service.ForgotPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ForgotPasswordController {

    @Autowired
    private ForgotPasswordService forgotPasswordService;

    @PostMapping("/forgotpassword")
    public ResponseEntity<String> resetPassword(@RequestBody ForgotPasswordDto dto)throws UsernameNotFoundException {
        String response = forgotPasswordService.forgotPassword(dto);
        if ("Password changed successfully".equals(response)) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

    }
}
