package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

    @Builder
    @NoArgsConstructor
    @Data
    public class AssetDto {

        @NotNull(message = "Employee ID is required")
        private Long employeeId;

        @NotBlank(message = "Employee Name is required")
        private String employeeName;

        private String department;

        private String assignedDate;

        private Long assetId;

        private String assetType;

        private String make;

        private String processor;

        private String ram;

        private String hardDisk;

        private String charger;

        private String chargerWatt;

        private String bag;

        private String modelNumber;

        private String serialNumber;

        private String issuedItPersonName;

        private String approvedBy;


        public @NotNull(message = "Employee ID is required") Long getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(@NotNull(message = "Employee ID is required") Long employeeId) {
            this.employeeId = employeeId;
        }

        public @NotBlank(message = "Employee Name is required") String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(@NotBlank(message = "Employee Name is required") String employeeName) {
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

        public Long getAssetId() {
            return assetId;
        }

        public void setAssetId(Long assetId) {
            this.assetId = assetId;
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

        public AssetDto(Long employeeId, String employeeName, String department, String assignedDate, Long assetId, String assetType, String manufacturer, String processor, String ram, String hardDisk, String charger, String chargerWatt, String bag, String modelNumber, String serialNumber, String issuedItPersonName, String approvedBy) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.department = department;
            this.assignedDate = assignedDate;
            this.assetId = assetId;
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
        }

        @Override
        public String toString() {
            return "AssetDto{" +
                    "employeeId=" + employeeId +
                    ", employeeName='" + employeeName + '\'' +
                    ", department='" + department + '\'' +
                    ", assignedDate='" + assignedDate + '\'' +
                    ", assetId=" + assetId +
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
                    '}';
        }
    }




