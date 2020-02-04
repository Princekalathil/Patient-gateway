package com.bytatech.ayoos.patientgateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.appointment.api.AppointmentCommandResourceApi;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AdditionalInformationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.PaymentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.ProcessPayment;
import com.bytatech.ayoos.patientgateway.service.AppointmentService;
import com.bytatech.ayoos.patientgateway.web.rest.CommandResource;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private Logger log =LoggerFactory.getLogger(AppointmentServiceImpl.class);
	
	@Autowired
	AppointmentCommandResourceApi appointmentCommandResourceApi; 

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> additionalInformtionRequest(String taskId,
			AdditionalInformationRequest additionalInformationRequest) {
		log.debug("<<<<<<<< additionalInformtionRequest >>>>>>>>{}",taskId,additionalInformationRequest);
		return appointmentCommandResourceApi.additionalInformationRequestUsingPOST(taskId, additionalInformationRequest);
	}

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> confirmPaymentRequest(String taskId,
			PaymentConfirmationRequest paymentConfirmationRequest) {
		log.debug("<<<<<<<<<< confirmPayment >>>>>>>{}",taskId,paymentConfirmationRequest);
		return appointmentCommandResourceApi.confirmPaymentUsingPOST(taskId, paymentConfirmationRequest);
	}

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> confirmRegistration(
			String taskId) {
		log.debug("<<<<<<<confirmRegistration >>>>>>>>{}",taskId);
		return appointmentCommandResourceApi.confirmRegistrationUsingPOST(taskId);
	}

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> initiateAppointment(
			AppointmentRequest appointmentRequest) {
		log.debug("<<<<<<<<< initiateAppointment >>>>>>>>{}",appointmentRequest);
		return appointmentCommandResourceApi.initiateAppointmentUsingPOST(appointmentRequest);
	}

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> processPayment(
			String taskId, ProcessPayment processPayment) {
		log.debug("<<<<<<<<<< processPayment >>>>>>>>>{}",taskId,processPayment);
		return appointmentCommandResourceApi.processPaymentUsingPOST(taskId, processPayment);
	}

	@Override
	public ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> sendAppointmentRequest(
			String taskId, AppointmentConfirmationRequest appointmentConfirmationRequest) {
		log.debug("<<<<<<< sendAppointmentRequest >>>>>>>>>{}",appointmentConfirmationRequest);
		return appointmentCommandResourceApi.sendAppointmentRequestUsingPOST(taskId, appointmentConfirmationRequest);
	}

}
