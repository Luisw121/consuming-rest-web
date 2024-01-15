package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

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
        headers
    }

}
