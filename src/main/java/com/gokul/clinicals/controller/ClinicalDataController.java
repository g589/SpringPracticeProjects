package com.gokul.clinicals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gokul.clinicals.dto.ClinicalDataRequest;
import com.gokul.clinicals.models.ClinicalData;
import com.gokul.clinicals.models.Patient;
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
		Patient patient =patientrepository.findById(request.getPatientId()).get();
		ClinicalData clinicaldata = new ClinicalData();
		clinicaldata.setComponentName(request.getComponentName());
		clinicaldata.setComponentValue(request.getComponentValue());
		clinicaldata.setPatient(patient);
		return clinicaldatarepository.save(clinicaldata);
		
	}

}
