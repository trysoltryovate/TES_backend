package com.example.repositry;
import com.example.entity.SignUpPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface SignUpRepo extends JpaRepository<SignUpPage, Long> {
         Optional<SignUpPage> findByEmail(String email);
        Optional<SignUpPage> findByUsername(String username);
        Optional<SignUpPage> findByMobile(String mobile);


    }


