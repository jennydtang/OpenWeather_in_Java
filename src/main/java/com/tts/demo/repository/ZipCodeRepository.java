package com.tts.demo.repository;

import com.tts.demo.model.ZipCode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
    public ZipCode findByZipCode(String zipCode);
}