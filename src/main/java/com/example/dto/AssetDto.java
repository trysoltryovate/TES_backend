package com.example.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


    //@NoArgsConstructor
    @Data
    public class AssetDto {


//        private long sNo;

        @NotNull(message = "Employee ID cannot be null")
        private Long employeeId;

        @NotBlank(message = "Employee Name is required.")
        private String employeeName;

        @NotBlank(message = "Department is Required.")
        private String department;

        @NotBlank(message = "Assigned Data Is Required.")
        private String assignedDate;

        // private Long assetId;

        @NotBlank(message = "Asset Type Is Required.")
        private String assetType;

        @NotBlank(message = "Make Is Required.")
        private String make;

        @NotBlank(message = "Processor Is Required.")
        private String processor;

        @NotBlank(message = "Ram Is Required.")
        private String ram;

        @NotBlank(message = "Hard Disk Is Required.")
        private String hardDisk;

        @NotBlank(message = "Charger Is Required.")
        private String charger;

        @NotBlank(message = "Charger Watt Is Required.")
        private String chargerWatt;

        @NotBlank(message = "Bag Is Required.")
        private String bag;

        @NotBlank(message = "Model Number Is Required.")
        private String modelNumber;

        @Column(unique = true)
        @NotBlank(message = "Serial Number Is Required.")
        private String serialNumber;


        @NotBlank(message = "Issued IT Person Name is required.")
        private String issuedItPersonName;

        @NotBlank(message = "ApprovedBy Is Required.")
        private String approvedBy;

        @NotBlank(message = "Location Is Required.")
        private String location;

        private boolean deleted = false;


        @Column(unique = true, length = 10)
        @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits")
        private String mobileNumber;

        public @NotNull(message = "Employee ID cannot be null") Long getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(@NotNull(message = "Employee ID cannot be null") Long employeeId) {
            this.employeeId = employeeId;
        }

        public @NotBlank(message = "Employee Name is required.") String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(@NotBlank(message = "Employee Name is required.") String employeeName) {
            this.employeeName = employeeName;
        }

        public @NotBlank(message = "Department is Required.") String getDepartment() {
            return department;
        }

        public void setDepartment(@NotBlank(message = "Department is Required.") String department) {
            this.department = department;
        }

        public @NotBlank(message = "Assigned Data Is Required.") String getAssignedDate() {
            return assignedDate;
        }

        public void setAssignedDate(@NotBlank(message = "Assigned Data Is Required.") String assignedDate) {
            this.assignedDate = assignedDate;
        }

        public @NotBlank(message = "Asset Type Is Required.") String getAssetType() {
            return assetType;
        }

        public void setAssetType(@NotBlank(message = "Asset Type Is Required.") String assetType) {
            this.assetType = assetType;
        }

        public @NotBlank(message = "Make Is Required.") String getMake() {
            return make;
        }

        public void setMake(@NotBlank(message = "Make Is Required.") String make) {
            this.make = make;
        }

        public @NotBlank(message = "Processor Is Required.") String getProcessor() {
            return processor;
        }

        public void setProcessor(@NotBlank(message = "Processor Is Required.") String processor) {
            this.processor = processor;
        }

        public @NotBlank(message = "Ram Is Required.") String getRam() {
            return ram;
        }

        public void setRam(@NotBlank(message = "Ram Is Required.") String ram) {
            this.ram = ram;
        }

        public @NotBlank(message = "Hard Disk Is Required.") String getHardDisk() {
            return hardDisk;
        }

        public void setHardDisk(@NotBlank(message = "Hard Disk Is Required.") String hardDisk) {
            this.hardDisk = hardDisk;
        }

        public @NotBlank(message = "Charger Is Required.") String getCharger() {
            return charger;
        }

        public void setCharger(@NotBlank(message = "Charger Is Required.") String charger) {
            this.charger = charger;
        }

        public @NotBlank(message = "Charger Watt Is Required.") String getChargerWatt() {
            return chargerWatt;
        }

        public void setChargerWatt(@NotBlank(message = "Charger Watt Is Required.") String chargerWatt) {
            this.chargerWatt = chargerWatt;
        }

        public @NotBlank(message = "Bag Is Required.") String getBag() {
            return bag;
        }

        public void setBag(@NotBlank(message = "Bag Is Required.") String bag) {
            this.bag = bag;
        }

        public @NotBlank(message = "Model Number Is Required.") String getModelNumber() {
            return modelNumber;
        }

        public void setModelNumber(@NotBlank(message = "Model Number Is Required.") String modelNumber) {
            this.modelNumber = modelNumber;
        }

        public @NotBlank(message = "Serial Number Is Required.") String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(@NotBlank(message = "Serial Number Is Required.") String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public @NotBlank(message = "Issued IT Person Name is required.") String getIssuedItPersonName() {
            return issuedItPersonName;
        }

        public void setIssuedItPersonName(@NotBlank(message = "Issued IT Person Name is required.") String issuedItPersonName) {
            this.issuedItPersonName = issuedItPersonName;
        }

        public @NotBlank(message = "ApprovedBy Is Required.") String getApprovedBy() {
            return approvedBy;
        }

        public void setApprovedBy(@NotBlank(message = "ApprovedBy Is Required.") String approvedBy) {
            this.approvedBy = approvedBy;
        }

        public @NotBlank(message = "Location Is Required.") String getLocation() {
            return location;
        }

        public void setLocation(@NotBlank(message = "Location Is Required.") String location) {
            this.location = location;
        }

        public @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be exactly 10 digits") String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public AssetDto(Long employeeId, String employeeName, String department, String assignedDate, String assetType, String make, String processor, String ram, String hardDisk, String charger, String chargerWatt, String bag, String modelNumber, String serialNumber, String issuedItPersonName, String approvedBy, String location, String mobileNumber) {
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

        public AssetDto() {
        }

        @Override
        public String toString() {
            return "AssetDto{" +
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



