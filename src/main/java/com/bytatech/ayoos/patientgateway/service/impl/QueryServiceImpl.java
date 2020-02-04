package com.bytatech.ayoos.patientgateway.service.impl;

import java.util.List;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.patientgateway.client.doctor.model.Qualification;
import com.bytatech.ayoos.patientgateway.service.QueryService;
import com.bytatech.ayoos.patientgateway.web.rest.util.ServiceUtility;
@Service
public class QueryServiceImpl implements QueryService{
	
	private Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	
	@Autowired
	ServiceUtility serviceUtilty;
	

	@Override
	public List<String> findAllQualifications(Pageable pageable) {
		log.debug("<<<<<<<<<<< findAllQualifications >>>>>>>");
		QueryBuilder dslQuery =	QueryBuilders.matchAllQuery();
		SearchSourceBuilder builder= new SearchSourceBuilder();
		SearchResponse response=serviceUtilty.searchResponseForObject("qualification", dslQuery);
		return serviceUtilty.getListResult(response, pageable, new Qualification());
	}

}
