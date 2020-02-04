package com.bytatech.ayoos.patientgateway.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.UserRatingDTO;

public interface DoctorService {

	ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable);

	ResponseEntity<Doctor> findDoctorByDoctorId(String doctorId);

	ResponseEntity<UserRatingDTO> createUserRating(UserRatingDTO userRatingDTO);

	ResponseEntity<ReviewDTO> createReview(ReviewDTO reviewDTO);

}
