package com.bytatech.ayoos.patientgateway.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

public interface QueryService {

	List<String> findAllQualifications(Pageable pageable);

}
