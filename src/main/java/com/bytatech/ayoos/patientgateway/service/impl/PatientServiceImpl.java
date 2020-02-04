package com.bytatech.ayoos.patientgateway.service.impl;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.patient.api.PatientResourceApi;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.service.PatientService;
import com.bytatech.ayoos.patientgateway.web.rest.util.ServiceUtility;

public class PatientServiceImpl implements PatientService{
	
	private final Logger log= LoggerFactory.getLogger(PatientServiceImpl.class);
	
	@Autowired
	ServiceUtility ServiceUtility;
	
	@Autowired
	PatientResourceApi patientResourceApi;

	@Override
	public ResponseEntity<Patient> findPatient(String patientCode) {
		log.debug("<<<<<<<<findPatient >>>>>>>{}",patientCode);
		QueryBuilder dslQuery=QueryBuilders.termQuery("IdpCode", patientCode);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		SearchResponse response = ServiceUtility.searchResponseForObject("patient", dslQuery);
		
		return ResponseEntity.ok().body(ServiceUtility.getObjectResult(response, new Patient()));
	}
	@Override
	public ResponseEntity<PatientDTO> createPatient(PatientDTO patientDTO) {
		log.debug("<<<<<<<<createPatient >>>>>>>{}",patientDTO);
		return patientResourceApi.createPatientUsingPOST1(patientDTO);
	}
	@Override
	public ResponseEntity<PatientDTO> updatePatient(PatientDTO patientDTO) {
		log.debug("<<<<<<<< updatePatient >>>>>>>{}",patientDTO);
		return patientResourceApi.updatePatientUsingPUT1(patientDTO);
	}
	
	
}
