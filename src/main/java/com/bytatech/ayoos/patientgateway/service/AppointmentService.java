package com.bytatech.ayoos.patientgateway.service;

import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.appointment.model.AdditionalInformationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.AppointmentRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.PaymentConfirmationRequest;
import com.bytatech.ayoos.patientgateway.client.appointment.model.ProcessPayment;
import com.bytatech.ayoos.patientgateway.web.rest.CommandResource;

public interface AppointmentService {

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> additionalInformtionRequest(
			String taskId, AdditionalInformationRequest additionalInformationRequest);

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> confirmPaymentRequest(
			String taskId, PaymentConfirmationRequest paymentConfirmationRequest);

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> confirmRegistration(
			String taskId);

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> initiateAppointment(
			AppointmentRequest appointmentRequest);

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> processPayment(
			String taskId, ProcessPayment processPayment);

	ResponseEntity<com.bytatech.ayoos.patientgateway.client.appointment.model.CommandResource> sendAppointmentRequest(
			String taskId, AppointmentConfirmationRequest appointmentConfirmationRequest);

	

}
