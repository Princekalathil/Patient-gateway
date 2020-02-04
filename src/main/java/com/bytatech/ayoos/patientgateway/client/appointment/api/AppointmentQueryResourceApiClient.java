package com.bytatech.ayoos.patientgateway.client.appointment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientgateway.client.appointment.ClientConfiguration;

@FeignClient(name="${appointment.name:appointment}", url="${appointment.url:35.229.27.47:8090/}", configuration = ClientConfiguration.class)
public interface AppointmentQueryResourceApiClient extends AppointmentQueryResourceApi {
}
