package com.example.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AssetDelete {

    @Id
    private long employeeId;


    @Column(name = "EmployeeName")
    private String employeeName;

    @Column(name = "Department")
    private String department;

    @Column(name = "AssignedDate")
    private String assignedDate;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="AssetId")
//    private long assetId;


    @Column(name = "AssetType")
    private String assetType;

    @Column(name = "Make")
    private String make;

    @Column(name = "Processor")
    private String processor;


    @Column(name = "Ram")
    private String ram;


    @Column(name = "HardDisk")
    private String hardDisk;

    @Column(name = "Charger")
    private String charger;

    @Column(name = "ChargerWatt")
    private String chargerWatt;

    @Column(name = "Bag")
    private String bag;

    @Column(name = "ModelNumber")
    private String modelNumber;

    @Column(name = "SerialNumber")
    private String serialNumber;


    @Column(name = "IssuedItPersonName")
    private String issuedItPersonName;

    @Column(name = "ApprovedBy")
    private String approvedBy;


    @Column(name = "Location")
    private String location;

    @Column(name = "MobileNumber")
    private String mobileNumber;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getChargerWatt() {
        return chargerWatt;
    }

    public void setChargerWatt(String chargerWatt) {
        this.chargerWatt = chargerWatt;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIssuedItPersonName() {
        return issuedItPersonName;
    }

    public void setIssuedItPersonName(String issuedItPersonName) {
        this.issuedItPersonName = issuedItPersonName;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public AssetDelete() {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.assignedDate = assignedDate;
        this.assetType = assetType;
        this.make = make;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.charger = charger;
        this.chargerWatt = chargerWatt;
        this.bag = bag;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.issuedItPersonName = issuedItPersonName;
        this.approvedBy = approvedBy;
        this.location = location;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "AssetDelete{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", assignedDate='" + assignedDate + '\'' +
                ", assetType='" + assetType + '\'' +
                ", make='" + make + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", charger='" + charger + '\'' +
                ", chargerWatt='" + chargerWatt + '\'' +
                ", bag='" + bag + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", issuedItPersonName='" + issuedItPersonName + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", location='" + location + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}

