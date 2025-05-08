

package com.example.service;

import com.example.dto.AssetDto;
import com.example.entity.Asset;
import com.example.exceptions.MultiFieldValidationException;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repositry.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepo assetRepo;

    @Override
    public Asset saveEmploye(AssetDto assetDto) {
        List<String> errorMessages = new ArrayList<>();

        // Check for employee ID uniqueness
        if (assetDto.getEmployeeId() != null && assetRepo.existsByEmployeeId(assetDto.getEmployeeId())) {
            errorMessages.add("Employee ID already exists.");
        }

        // Check for serial number uniqueness
        if (assetRepo.existsBySerialNumber(assetDto.getSerialNumber())) {
            errorMessages.add("Serial Number already assigned to another asset.");
        }

        // Check for mobile number uniqueness
        if (assetRepo.existsByMobileNumber(assetDto.getMobileNumber())) {
            errorMessages.add("Mobile Number already registered to another employee.");
        }

        // Check for model number uniqueness
        if (assetRepo.existsByModelNumber(assetDto.getModelNumber())) {
            errorMessages.add("Model Number already assigned to another asset.");
        }

        // Validate mobile number format (10 digits)
        if (!assetDto.getMobileNumber().matches("\\d{10}")) {
            errorMessages.add("Mobile number must be exactly 10 digits.");
        }

        // If there are any validation errors, throw a custom exception with all error messages
        if (!errorMessages.isEmpty()) {
            throw new MultiFieldValidationException(errorMessages);  // Custom exception to handle multiple errors
        }

        // If no validation errors, map DTO to entity and save it
        Asset entity = mapDtoToEntity(assetDto);
        return assetRepo.save(entity);
    }

    @Override
    public Asset findByID(Long id) {
        return assetRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Asset not found with ID: " + id));
    }

    @Override
    public Asset UpdatedEmploye(Long id, AssetDto assetDto) {
        Asset existing = assetRepo.findByEmployeeId(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));

        List<String> errorMessages = new ArrayList<>();

        // Check for employee ID uniqueness if it's changed
        if (assetDto.getEmployeeId() != null &&
                !assetDto.getEmployeeId().equals(existing.getEmployeeId()) &&
                assetRepo.existsByEmployeeId(assetDto.getEmployeeId())) {
            errorMessages.add("Employee ID already exists.");
        }

        // Check for serial number uniqueness if it's changed
        if (!existing.getSerialNumber().equals(assetDto.getSerialNumber())
                && assetRepo.existsBySerialNumber(assetDto.getSerialNumber())) {
            errorMessages.add("Serial Number already assigned to another asset.");
        }

        // Check for mobile number uniqueness if it's changed
        if (!existing.getMobileNumber().equals(assetDto.getMobileNumber())
                && assetRepo.existsByMobileNumber(assetDto.getMobileNumber())) {
            errorMessages.add("Mobile Number already registered to another employee.");
        }

        if (!existing.getModelNumber().equals(assetDto.getModelNumber())
                && assetRepo.existsByModelNumber(assetDto.getModelNumber())) {
            errorMessages.add("Model Number already assigned to another asset.");
        }

        // Validate mobile number format (10 digits)
        if (!assetDto.getMobileNumber().matches("\\d{10}")) {
            errorMessages.add("Mobile number must be exactly 10 digits.");
        }

        // If there are any validation errors, throw a custom exception with all error messages
        if (!errorMessages.isEmpty()) {
            throw new MultiFieldValidationException(errorMessages);  // Custom exception to handle multiple errors
        }

        // Update existing entity with new values
        existing.setEmployeeId(assetDto.getEmployeeId());
        existing.setEmployeeName(assetDto.getEmployeeName());
        existing.setDepartment(assetDto.getDepartment());
        existing.setAssignedDate(assetDto.getAssignedDate());
        existing.setAssetType(assetDto.getAssetType());
        existing.setBag(assetDto.getBag());
        existing.setMake(assetDto.getMake());
        existing.setModelNumber(assetDto.getModelNumber());
        existing.setSerialNumber(assetDto.getSerialNumber());
        existing.setIssuedItPersonName(assetDto.getIssuedItPersonName());
        existing.setApprovedBy(assetDto.getApprovedBy());
        existing.setCharger(assetDto.getCharger());
        existing.setChargerWatt(assetDto.getChargerWatt());
        existing.setHardDisk(assetDto.getHardDisk());
        existing.setProcessor(assetDto.getProcessor());
        existing.setRam(assetDto.getRam());
        existing.setLocation(assetDto.getLocation());
        existing.setMobileNumber(assetDto.getMobileNumber());

        return assetRepo.save(existing);
    }

    @Override
    public void deleteById(Long id) {
        if (!assetRepo.existsById(id)) {
            throw new ResourceNotFoundException("Cannot delete. Asset not found with ID: " + id);
        }
        assetRepo.deleteById(id);
    }

    @Override
    public List<Asset> findAllDetails() {
        return assetRepo.findAll();
    }

    @Override
    public Asset getById(Long id) {
        return findByID(id);
    }

    // Utility method to convert DTO to Entity
    private Asset mapDtoToEntity(AssetDto dto) {
        Asset entity = new Asset();
        entity.setEmployeeId(dto.getEmployeeId());
        entity.setEmployeeName(dto.getEmployeeName());
        entity.setDepartment(dto.getDepartment());
        entity.setAssignedDate(dto.getAssignedDate());
        entity.setAssetType(dto.getAssetType());
        entity.setBag(dto.getBag());
        entity.setMake(dto.getMake());
        entity.setModelNumber(dto.getModelNumber());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setIssuedItPersonName(dto.getIssuedItPersonName());
        entity.setApprovedBy(dto.getApprovedBy());
        entity.setCharger(dto.getCharger());
        entity.setChargerWatt(dto.getChargerWatt());
        entity.setHardDisk(dto.getHardDisk());
        entity.setProcessor(dto.getProcessor());
        entity.setRam(dto.getRam());
        entity.setLocation(dto.getLocation());
        entity.setMobileNumber(dto.getMobileNumber());
        return entity;
    }
}


