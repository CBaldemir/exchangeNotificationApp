package com.example.exchangeNotificationApp.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/exchange")
public class ExchangeNotificationController{


    @GetMapping("/list")
    public ExchangeResponse getExchangeRate() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("token", "_magic");
        headers.add("auid", "");
        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<Object> responseEntity = restTemplate.exchange
                ("https://finans.apipara.com/json/v7//market?auid=1", HttpMethod.GET, httpEntity, Object.class);


        ResponseEntity<ExchangeResponse> responseEntity2 = restTemplate.exchange
                ("https://finans.apipara.com/json/v7//market?auid=1", HttpMethod.GET, httpEntity, ExchangeResponse.class);

        return responseEntity2.getBody();
    }
}
