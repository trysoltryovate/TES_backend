package com.example.dto;

public class LoginDto {

    private String message;
    private boolean success;

    // Constructor, getters, and setters
    public LoginDto(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;

    }
}
