package com.bytatech.ayoos.patientgateway.web.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.service.DoctorService;
import com.bytatech.ayoos.patientgateway.service.PatientService;
import com.bytatech.ayoos.patientgateway.service.QueryService;

@RestController 
@RequestMapping("/api")
public class QueryResource {
	
	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	QueryService queryService;
	
	@GetMapping("/findAllDoctors")
	public ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable) {
		log.debug("<<<<< findAllDoctors >>>>>>");
		return doctorService.findAllDoctors(pageable);
	}
	@GetMapping("/patient/{patientCode}")
	public ResponseEntity<Patient> findPatient(@PathVariable String patientCode) {
		log.debug("<<<<<<<<<<< findPatient >>>>>>>>>{}",patientCode);
		return patientService.findPatient(patientCode);
	}
	@GetMapping("/findAllQualification")
	public List<String> findAllQualification(Pageable pageable) {
		log.debug("<<<<<<<< findAllQualification >>>>>>>>");
		return queryService.findAllQualifications(pageable);
	}
	@GetMapping("/doctors/{doctorId}")
	public ResponseEntity<Doctor> findDoctorByDoctorId(@PathVariable String doctorId) {
		log.debug("<<<<<<<<<<< findDoctorByDoctorId >>>>>>>>>>{}",doctorId);
		return doctorService.findDoctorByDoctorId(doctorId);
	}
}
