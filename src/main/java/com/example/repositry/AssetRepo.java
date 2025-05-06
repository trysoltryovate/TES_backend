package com.example.repositry;

import com.example.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface AssetRepo extends JpaRepository<Asset,Long> {

    }


