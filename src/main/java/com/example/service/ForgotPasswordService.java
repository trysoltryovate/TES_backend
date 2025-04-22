package com.example.service;
import com.example.dto.ForgotPasswordDto;
import com.example.entity.SignUpPage;
import com.example.repositry.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.imageio.spi.RegisterableService;
import java.util.Optional;

@Service
public class ForgotPasswordService {

    @Autowired
    private SignUpRepo signUpRepo;

        public String forgotPassword(ForgotPasswordDto forgotPasswordDto) throws UsernameNotFoundException {
            Optional<SignUpPage> optionalUser = signUpRepo.findByEmail(forgotPasswordDto.getEmail());

            if (optionalUser.isPresent()) {
                SignUpPage user = optionalUser.get();

                if (!forgotPasswordDto.getPassword().equals(forgotPasswordDto.getConfirmPassword())) {
                    return "Password does not match.";
                }

                user.setPassword(forgotPasswordDto.getPassword());
                signUpRepo.save(user);

                return "Password changed successfully";
            } else {
                throw new UsernameNotFoundException("User not found with the given email: " + forgotPasswordDto.getEmail());
            }
        }

    }







