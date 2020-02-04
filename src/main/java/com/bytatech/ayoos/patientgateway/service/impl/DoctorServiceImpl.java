package com.bytatech.ayoos.patientgateway.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.api.ReviewResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.api.UserRatingResourceApi;
import com.bytatech.ayoos.patientgateway.client.doctor.model.Doctor;
import com.bytatech.ayoos.patientgateway.client.doctor.model.ReviewDTO;
import com.bytatech.ayoos.patientgateway.client.doctor.model.UserRatingDTO;
import com.bytatech.ayoos.patientgateway.service.DoctorService;
import com.bytatech.ayoos.patientgateway.web.rest.util.ServiceUtility;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	private final Logger log = LoggerFactory.getLogger(DoctorServiceImpl.class);
	
	@Autowired
	RestHighLevelClient restHighLevelClient;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	ServiceUtility serviceUtility;
	
	@Autowired
	DoctorResourceApi doctorResourceApi;
	
	@Autowired
	UserRatingResourceApi userRatingResourceApi;
	
	@Autowired
	ReviewResourceApi reviewResourceApi;

	@Override
	public ResponseEntity<List<Doctor>> findAllDoctors(Pageable pageable) {
		log.debug("<<<<<<<<<< findAllDoctors >>>>>>>");
		List<Doctor> list = new ArrayList<>();
		QueryBuilder dslQuery = QueryBuilders.matchAllQuery();
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchRequest request = new SearchRequest("doctor");
		request.source(builder);
		SearchResponse response=null;
		try {
			response= restHighLevelClient.search(request, RequestOptions.DEFAULT);
		}catch (IOException e) {
			e.printStackTrace();
		}
		SearchHit[] searchHit = response.getHits().getHits();
		Doctor d = new Doctor();
		for(SearchHit hit : searchHit) {
			
			list.add(objectMapper.convertValue(hit.getSourceAsMap(), d.getClass()));
		}
		
		return ResponseEntity.ok().body(list);
	}

	@Override
	public ResponseEntity<Doctor> findDoctorByDoctorId(String doctorId) {
		log.debug("<<<<<<<<<<<< findDoctorByDoctorId>>>>>>>>{}",doctorId);
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("doctorId", doctorId);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("doctor", dslQuery);
		
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Doctor()));
	}
	
	@Override
	public ResponseEntity<UserRatingDTO> createUserRating(UserRatingDTO userRatingDTO) {
		log.debug("<<<<<<<< createUserRating >>>>>>>>",userRatingDTO);
		return userRatingResourceApi.createUserRatingUsingPOST(userRatingDTO);
	}
	
	@Override
	public ResponseEntity<ReviewDTO> createReview(ReviewDTO reviewDTO) {
		log.debug("<<<<<<createReview >>>>>>>>{}",reviewDTO);
		return reviewResourceApi.createReviewUsingPOST(reviewDTO);
	}

}
