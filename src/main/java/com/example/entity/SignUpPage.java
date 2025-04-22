package com.example.entity;

import jakarta.persistence.*;


@Entity
public class SignUpPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;


    @Column(name = "Email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "Password")
    private String password;

    @Column(name = "ConfirmPassword")
    private String confirmPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public SignUpPage(Long id, String username, String email, String mobile, String password, String confirmPassword) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public SignUpPage() {
    }

    @Override
    public String toString() {
        return "SignUpPage{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}