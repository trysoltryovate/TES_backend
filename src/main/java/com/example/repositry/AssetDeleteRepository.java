package com.example.repositry;

import com.example.entity.AssetDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetDeleteRepository extends JpaRepository<AssetDelete,Long> {
}
