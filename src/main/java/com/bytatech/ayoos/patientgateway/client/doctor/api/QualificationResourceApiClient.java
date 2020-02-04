package com.bytatech.ayoos.patientgateway.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientgateway.client.doctor.DoctorClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url}", configuration = DoctorClientConfiguration.class)
public interface QualificationResourceApiClient extends QualificationResourceApi {
}