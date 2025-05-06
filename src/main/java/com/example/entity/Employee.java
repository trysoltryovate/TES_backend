package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity

@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long sNo;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "name")
    private String name;

    @Column(name = "Skill")
    private String skill;


    @Column(name = "ProjectsShadow")
    private String projectsShadow;


    @Column(name = "Experience")
    private String experience;

    @Column(name = "NDA")
    private String nda;

    @Column(name = "CVReady")
    private String cvReady;

    @Column(name = "Linkedin")
    private String linkedin;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DateofNDA")
    private String dateOfNDA;


    @Column(name = "Notary")
    private String notary;

    @Column(name = "Affidavit")
    private String affidavit;

    @Column(name = "Salaryondeployed")
    private String salaryOnDeployed;

    @Column(name = "Salary")
    private String salaryOnBench;

    @Column(name = "Readytotravel")
    private String readyToTravel;

    @Column(name = "Email")
    private String email;


    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits")

    @Column(name = "Mobilenum")
    private String mobileNum;

    public Long getsNo() {
        return sNo;
    }

    public void setsNo(Long sNo) {
        this.sNo = sNo;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getProjectsShadow() {
        return projectsShadow;
    }

    public void setProjectsShadow(String projectsShadow) {
        this.projectsShadow = projectsShadow;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getNda() {
        return nda;
    }

    public void setNda(String nda) {
        this.nda = nda;
    }

    public String getCvReady() {
        return cvReady;
    }

    public void setCvReady(String cvReady) {
        this.cvReady = cvReady;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Employee() {
        this.sNo = sNo;
        this.mode = mode;
        this.name = name;
        this.skill = skill;
        this.projectsShadow = projectsShadow;
        this.experience = experience;
        this.nda = nda;
        this.cvReady = cvReady;
        this.linkedin = linkedin;
        this.dateOfNDA = dateOfNDA;
        this.notary = notary;
        this.affidavit = affidavit;
        this.salaryOnDeployed = salaryOnDeployed;
        this.salaryOnBench = salaryOnBench;
        this.readyToTravel = readyToTravel;
        this.email = email;
        this.mobileNum = mobileNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sNo=" + sNo +
                ", mode='" + mode + '\'' +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", projectsShadow='" + projectsShadow + '\'' +
                ", experience='" + experience + '\'' +
                ", nda='" + nda + '\'' +
                ", cvReady='" + cvReady + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", dateOfNDA='" + dateOfNDA + '\'' +
                ", notary='" + notary + '\'' +
                ", affidavit='" + affidavit + '\'' +
                ", salaryOnDeployed='" + salaryOnDeployed + '\'' +
                ", salaryOnBench='" + salaryOnBench + '\'' +
                ", readyToTravel='" + readyToTravel + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}';
    }
}


