package com.bytatech.ayoos.patientgateway.service;

import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderRequest;
import com.bytatech.ayoos.patientgateway.client.payment.model.OrderResponse;

public interface PaymentService {

	ResponseEntity<OrderResponse> createOrder(OrderRequest orderRequest);

	ResponseEntity<PatientDTO> modelToDto(Patient patient);

}
