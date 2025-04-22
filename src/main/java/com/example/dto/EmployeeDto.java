package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmployeeDto {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;

    // @NotBlank(message = "Mobile number is mandatory")
    //private String mobileNum;


    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits")
    private String mobileNum;

    private String skill;
    private String experience;
    private String cvReady;
    private String salaryOnDeployed;
    private String salaryOnBench;
    private String readyToTravel;
    private String mode;
    private String projectsShadow;
    private String nda;
    private String dateOfNDA;
    private String notary;
    private String affidavit;

    @NotBlank(message = "LinkedIn is mandatory")
    private String linkedin;

    public @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public @NotBlank(message = "Email is mandatory") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is mandatory") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Name is mandatory") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is mandatory") String name) {
        this.name = name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getCvReady() {
        return cvReady;
    }

    public void setCvReady(String cvReady) {
        this.cvReady = cvReady;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalaryOnDeployed() {
        return salaryOnDeployed;
    }

    public void setSalaryOnDeployed(String salaryOnDeployed) {
        this.salaryOnDeployed = salaryOnDeployed;
    }

    public String getSalaryOnBench() {
        return salaryOnBench;
    }

    public void setSalaryOnBench(String salaryOnBench) {
        this.salaryOnBench = salaryOnBench;
    }

    public String getReadyToTravel() {
        return readyToTravel;
    }

    public void setReadyToTravel(String readyToTravel) {
        this.readyToTravel = readyToTravel;
    }

    public String getProjectsShadow() {
        return projectsShadow;
    }

    public void setProjectsShadow(String projectsShadow) {
        this.projectsShadow = projectsShadow;
    }

    public String getNda() {
        return nda;
    }

    public void setNda(String nda) {
        this.nda = nda;
    }

    public String getDateOfNDA() {
        return dateOfNDA;
    }

    public void setDateOfNDA(String dateOfNDA) {
        this.dateOfNDA = dateOfNDA;
    }

    public String getNotary() {
        return notary;
    }

    public void setNotary(String notary) {
        this.notary = notary;
    }

    public String getAffidavit() {
        return affidavit;
    }

    public void setAffidavit(String affidavit) {
        this.affidavit = affidavit;
    }

    public @NotBlank(message = "LinkedIn is mandatory") String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(@NotBlank(message = "LinkedIn is mandatory") String linkedin) {
        this.linkedin = linkedin;
    }

    public EmployeeDto(String name, String email, String mobileNum, String skill, String experience, String cvReady, String salaryOnDeployed, String salaryOnBench, String readyToTravel, String mode, String projectsShadow, String nda, String dateOfNDA, String notary, String affidavit, String linkedin) {
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.skill = skill;
        this.experience = experience;
        this.cvReady = cvReady;
        this.salaryOnDeployed = salaryOnDeployed;
        this.salaryOnBench = salaryOnBench;
        this.readyToTravel = readyToTravel;
        this.mode = mode;
        this.projectsShadow = projectsShadow;
        this.nda = nda;
        this.dateOfNDA = dateOfNDA;
        this.notary = notary;
        this.affidavit = affidavit;
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", skill='" + skill + '\'' +
                ", experience='" + experience + '\'' +
                ", cvReady='" + cvReady + '\'' +
                ", salaryOnDeployed='" + salaryOnDeployed + '\'' +
                ", salaryOnBench='" + salaryOnBench + '\'' +
                ", readyToTravel='" + readyToTravel + '\'' +
                ", mode='" + mode + '\'' +
                ", projectsShadow='" + projectsShadow + '\'' +
                ", nda='" + nda + '\'' +
                ", dateOfNDA='" + dateOfNDA + '\'' +
                ", notary='" + notary + '\'' +
                ", affidavit='" + affidavit + '\'' +
                ", linkedin='" + linkedin + '\'' +
                '}';
    }
}



