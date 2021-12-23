package com.gokul.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.clinicals.models.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

}
