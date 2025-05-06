package com.example.controller;

import com.example.dto.AssetDto;
import com.example.entity.Asset;
import com.example.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
   @RequestMapping("/asset")
    public class AssetController {

        @Autowired
        AssetService assetService;

        @PostMapping("/  ")
        public ResponseEntity<String> saveEmployeDetails(@RequestBody AssetDto assetDto) {
            assetService.saveEmploye(assetDto);

            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully saved Details");
        }
        @GetMapping("/DetalisById/{id}")
        public ResponseEntity<Asset> getDetailsById(@PathVariable Long id){
            Asset info =assetService.findByID(id);
            return ResponseEntity.status(HttpStatus.CREATED).body(info);
        }
        @PutMapping("/update/{id}")
        public  ResponseEntity<String> updateEmployeDetails(@PathVariable Long id,@RequestBody AssetDto assetDto ){
            assetService.UpdatedEmploye(id,assetDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Updated");
        }
        @DeleteMapping("/delete/{id}")
        public void deleteById(@PathVariable Long id){
            assetService.deleteById(id);
        }
        @GetMapping("/getAll")
        public List<Asset> getAllEmploye(){
            return    assetService.findAllDetails();
        }


    }






