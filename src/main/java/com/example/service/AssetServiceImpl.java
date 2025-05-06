package com.example.service;


import com.example.dto.AssetDto;
import com.example.entity.Asset;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repositry.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class AssetServiceImpl implements AssetService {
        @Autowired
        AssetRepo assetRepo;

        @Override
        public Asset saveEmploye(AssetDto assetDto) {
            Asset entity = new Asset();

            entity.setEmployeeName(assetDto.getEmployeeName());
            entity.setDepartment(assetDto.getDepartment());
            entity.setAssignedDate(assetDto.getAssignedDate());
            entity.setAssetId(assetDto.getAssetId());
            entity.setAssetType(assetDto.getAssetType());
            entity.setAssetType(assetDto.getAssetType());
            entity.setBag(assetDto.getBag());
            entity.setMake(assetDto.getMake());
            entity.setModelNumber(assetDto.getModelNumber());
            entity.setSerialNumber(assetDto.getSerialNumber());
            entity.setIssuedItPersonName(assetDto.getIssuedItPersonName());
            entity.setApprovedBy(assetDto.getApprovedBy());
            entity.setCharger(assetDto.getCharger());
            entity.setChargerWatt(assetDto.getChargerWatt());
            entity.setHardDisk(assetDto.getHardDisk());
            entity.setProcessor(assetDto.getProcessor());
            entity.setRam(assetDto.getRam());

            Asset saved = assetRepo.save(entity);
            return saved;
        }

        @Override
        public Asset findByID(Long id) {

            Optional<Asset> assetInfo= assetRepo.findById(id);

            return assetRepo.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

        }

        @Override
        public Asset UpdatedEmploye(Long id, AssetDto assetDto) {
            Asset ass = assetRepo.findById(id)
                    .orElseThrow(() -> new com.example.exceptions.ResourceNotFoundException("Employee not found with ID: " + id));



            ass.setEmployeeName(assetDto.getEmployeeName());
            ass.setDepartment(assetDto.getDepartment());
            ass.setAssignedDate(assetDto.getAssignedDate());
            ass.setAssetId(assetDto.getAssetId());
            ass.setAssetType(assetDto.getAssetType());
            ass.setMake(assetDto.getMake());
            ass.setModelNumber(assetDto.getModelNumber());
            ass.setIssuedItPersonName(assetDto.getIssuedItPersonName());
            return assetRepo.save(ass);



        }

        @Override
        public void deleteById(Long id) {
            assetRepo.deleteById(id);
        }

        @Override
        public List<Asset> findAllDetails() {
            return  assetRepo.findAll();
        }



    }




