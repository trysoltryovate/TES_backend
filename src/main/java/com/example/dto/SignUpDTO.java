package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SignUpDTO {


        @NotBlank(message = "Username is required")
        private String username;

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        private String email;

        @NotBlank(message = "Password is required")
        private String password;

        @NotBlank(message = "Confirm Password is required")
        private String confirmPassword;

        @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
        private String mobile;

        public SignUpDTO() {}

        public SignUpDTO(String username, String email, String password, String confirmPassword, String mobile) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.confirmPassword = confirmPassword;
            this.mobile = mobile;
        }

    public @NotBlank(message = "Username is required") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "Username is required") String userName) {
        this.username = userName;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Confirm Password is required") String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(@NotBlank(message = "Confirm Password is required") String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits") String getMobile() {
        return mobile;
    }

    public void setMobile(@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits") String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}



