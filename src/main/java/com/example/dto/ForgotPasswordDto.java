package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class  ForgotPasswordDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Confirm Password is required")
    private String confirmPassword;


    public @NotBlank(message = "Email is required") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") @Size(min = 6, message = "Password must be at least 6 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 6, message = "Password must be at least 6 characters") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Confirm Password is required") String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(@NotBlank(message = "Confirm Password is required") String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public ForgotPasswordDto(String email, String password, String confirmPassword) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "ForgotPasswordDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}







