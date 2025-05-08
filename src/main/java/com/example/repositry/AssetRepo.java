
package com.example.repositry;

import com.example.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AssetRepo extends JpaRepository<Asset, Long> {

    boolean existsByEmployeeId(Long employeeId);
    boolean existsBySerialNumber(String serialNumber);
    boolean existsByMobileNumber(String mobileNumber);
    boolean existsByModelNumber(String modelNumber);
    Optional<Asset> findByEmployeeId(Long employeeId);  // Return Optional<Asset> here
}

