package com.example.service;

import com.example.dto.SignUpDTO;
import com.example.entity.SignUpPage;

import com.example.exceptions.UserAlreadyExist;
import com.example.repositry.SignUpRepo;
import com.example.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRepo signUpRepo;

    @Override
    public void register(SignUpDTO dto) {
        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            throw new IllegalArgumentException("Password and Confirm Password do not match");
        }

//        if (signUpRepo.findByUsername(dto.getUsername()).isPresent()) {
//            throw new UserAlreadyExist("Username already exists");
//        }

        if (signUpRepo.findByEmail(dto.getEmail()).isPresent()) {
            throw new UserAlreadyExist("Email already exists");
        }

        if (signUpRepo.findByMobile(dto.getMobile()).isPresent()) {
            throw new UserAlreadyExist("Mobile number already exists");
        }



        SignUpPage user = new SignUpPage();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setConfirmPassword(dto.getConfirmPassword());
        user.setMobile(dto.getMobile());

        signUpRepo.save(user);
    }
}
