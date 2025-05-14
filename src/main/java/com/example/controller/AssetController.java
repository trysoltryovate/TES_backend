package com.example.controller;

import com.example.dto.AssetDto;
import com.example.entity.Asset;
import com.example.entity.AssetDelete;
import com.example.repositry.AssetDeleteRepo;
import com.example.service.AssetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
   @RequestMapping("/asset")
    public class AssetController {

        @Autowired
       private AssetService assetService;
        @Autowired
        private AssetDeleteRepo assetDeleteRepo;


        @PostMapping("assign-asset")
        public ResponseEntity<String> saveAsset( @Valid @RequestBody AssetDto assetDto) {
            assetService.saveEmploye(assetDto);

            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully saved Details");
        }

//        @GetMapping("/DetalisById/{id}")
//        public ResponseEntity<Asset> getDetailsById(@PathVariable Long id){
//            Asset info =assetService.findByID(id);
//            return ResponseEntity.status(HttpStatus.CREATED).body(info);
//        }

        @GetMapping("/asset/get/{id}")
        public ResponseEntity<Asset> getAssetById(@PathVariable Long id) {
            Asset asset = assetService.findByID(id); // Implement this in your service
            return ResponseEntity.ok(asset);
        }


        @PutMapping("/update/{id}")
        public  ResponseEntity<String> updateEmployeDetails(@PathVariable Long id,@RequestBody AssetDto assetDto ){
            assetService.UpdatedEmploye(id,assetDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Updated");
        }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteById(@PathVariable Long id){
            assetService.deleteById(id);
            return ResponseEntity.ok("Deleted successfully");
        }
        @GetMapping("/getAll")
        public List<Asset> getAllEmploye(){
            return    assetService.findAllDetails();
        }



        @GetMapping("/assetDeleteData")
        public List<AssetDelete> deleteAssetData(){

            return assetDeleteRepo.findAll();
        }


    }





























  