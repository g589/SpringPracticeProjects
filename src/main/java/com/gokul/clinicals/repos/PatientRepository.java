package com.gokul.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.clinicals.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
