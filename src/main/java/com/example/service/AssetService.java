package com.example.service;



import com.example.dto.AssetDto;
import com.example.entity.Asset;

import java.util.List;
import java.util.Optional;

    public interface AssetService {

        Asset saveEmploye(AssetDto assetDto);

        Asset findByID(Long id);


        Asset UpdatedEmploye(Long id, AssetDto assetDto);


        void deleteById(Long id);

        List<Asset> findAllDetails();

    }


