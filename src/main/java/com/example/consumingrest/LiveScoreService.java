package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.http.HttpHeaders;


@Service
public class LiveScoreService {
    @Value("${api.url}")
    private String apiUrl;
    @Value("${api.key}")
    private String apiKey;
    @Value("${api.host}")
    private String apiHost;
    private final RestTemplate restTemplate;

    public LiveScoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LiveScores getLiveScores() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", apiKey);
        headers.set("X-RapidAPI-Host", apiHost);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Void> httpEntity = new HttpEntity<>(headers);

        try {
            ResponseEntity<LiveScores> responseEntity = restTemplate.exchange(
                    apiUrl,
                    HttpMethod.GET,
                    httpEntity,
                    LiveScores.class
            );
            return responseEntity.getBody();
        }catch (HttpClientErrorException | HttpServerErrorException e) {
            e.printStackTrace();
            throw new RuntimeException("Error en la llamada a la API - HttpStatus: " + e.getStatusCode() + ", Response: " + e.getResponseBodyAsString());
        }
    }

}
