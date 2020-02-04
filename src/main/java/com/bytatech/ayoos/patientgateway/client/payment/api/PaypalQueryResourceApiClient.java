package com.bytatech.ayoos.patientgateway.client.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientgateway.client.payment.PaymentClientConfiguration;

@FeignClient(name="${payment.name:payment}", url="${payment.url:34.68.84.96:9090/}", configuration = PaymentClientConfiguration.class)
public interface PaypalQueryResourceApiClient extends PaypalQueryResourceApi {
}