package com.bytatech.ayoos.patientgateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientgateway.client.appointment.model.AdditionalInformationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.PaymentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.ProcessPayment;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.UserRatingDTO;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderRequest;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderResponse;
import com.bytatech.ayoos.patientgateway.service.AppointmentService;
import com.bytatech.ayoos.patientgateway.service.DoctorService;
import com.bytatech.ayoos.patientgateway.service.PatientService;
import com.bytatech.ayoos.patientgateway.service.PaymentService;

@RestController
@RequestMapping("/api")
public class CommandResource {
	
	private Logger log = LoggerFactory.getLogger(CommandResource.class);
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/rating")
	public ResponseEntity<UserRatingDTO> ratedoctor(@RequestBody UserRatingDTO userRatingDTO) {
		log.debug("<<<<<< ratedoctor >>>>>>>{}",userRatingDTO);
		return doctorService.createUserRating(userRatingDTO);
	}
	@PostMapping("/review")
	public ResponseEntity<ReviewDTO> reviewdoctor(@RequestBody ReviewDTO reviewDTO) {
		log.debug("<<<<<<<<<<< reviewdoctor>>>>>>>>>{}",reviewDTO);
		return doctorService.createReview(reviewDTO);
	}
	@PostMapping("/patient")
	public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patientDTO) {
		log.debug("<<<<<<<<< createPatient >>>>>>>>{}",patientDTO);
		return patientService.createPatient(patientDTO);
	}
	@PutMapping("/patient")
	public ResponseEntity<PatientDTO> updatePatient(@RequestBody PatientDTO patientDTO) {
		log.debug("<<<<<<<<< updatePatient >>>>>>>{}",patientDTO);
		return patientService.updatePatient(patientDTO);
	}
	@PostMapping("/appointments/additionalInformationRequest/{taskId}")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> createAdditionalInformationRequest(
			@PathVariable String taskId,
			@RequestBody AdditionalInformationRequest additionalInformationRequest) {
		log.debug("<<<<<<<<<<createAdditionalInformationRequest >>>>>>>>{}",taskId,additionalInformationRequest);
		return appointmentService.additionalInformtionRequest(taskId,additionalInformationRequest);
	}
	@PostMapping("/appointments/confirmPayment/{taskId}")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> createConfirmPayment(
			@PathVariable("taskId") String taskId, @RequestBody PaymentConfirmationRequest paymentConfirmationRequest) {
		return appointmentService.confirmPaymentRequest(taskId, paymentConfirmationRequest);
	}
	@PostMapping("/appointments/confirmRegistration/{taskId}")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> createConfirmRegistration(
			@PathVariable("taskId") String taskId) {
		return appointmentService.confirmRegistration(taskId);
	}
	@PostMapping("/appointments/initiateAppointment")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> createInitiateAppointment(
			@RequestBody AppointmentRequest appointmentRequest) {
		ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> c = appointmentService
				.initiateAppointment(appointmentRequest);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>" + c.getBody());
		return c;
	}
	@PostMapping("/appointments/processPayment/{taskId}")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> createProcessPayment(
			@PathVariable("taskId") String taskId, @RequestBody ProcessPayment processPayment) {
		return appointmentService.processPayment(taskId, processPayment);
	}
	@PostMapping("/appointments/sendAppointmentRequest/{taskId}")
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> sendAppointmentRequest(
			@PathVariable String taskId, @RequestBody AppointmentConfirmationRequest appointmentConfirmationRequest) {
		return appointmentService.sendAppointmentRequest(taskId, appointmentConfirmationRequest);
	}
	@PostMapping("/payment/createOrder")
	public ResponseEntity<OrderResponse> createOrderPayment(@RequestBody OrderRequest orderRequest) {
		return paymentService.createOrder(orderRequest);
	}
	@PostMapping("/patients/modelToDto")
	public ResponseEntity<PatientDTO> modelToDto(@RequestBody Patient patient) {
		return paymentService.modelToDto(patient);

	}
}
