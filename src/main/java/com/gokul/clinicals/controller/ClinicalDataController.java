package com.gokul.clinicals.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gokul.clinicals.dto.ClinicalDataRequest;
import com.gokul.clinicals.models.ClinicalData;
import com.gokul.clinicals.repos.ClinicalDataRepository;
import com.gokul.clinicals.repos.PatientRepository;

@RestController
@RequestMapping("/api")

public class ClinicalDataController {
	
	
	private ClinicalDataRepository clinicaldatarepository;
	private PatientRepository patientrepository;
	
	@Autowired
	ClinicalDataController(ClinicalDataRepository clinicaldatarepository,PatientRepository patientrepository){
		this.clinicaldatarepository=clinicaldatarepository;
		this.patientrepository=patientrepository;
	}
	
	
	
	@RequestMapping(value="/clinicals",method = RequestMethod.POST)
	public ClinicalData saveClinicalData(@RequestBody ClinicalDataRequest request) {
		patientrepository.findById(request.getPatientId()).get();
		return null;
		
	}

}
