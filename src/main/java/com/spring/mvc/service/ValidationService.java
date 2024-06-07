package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
@Service
public class ValidationService {


    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> validateFile(MultipartFile file) {
        // Send the file to the REST API for validation
        String apiUrl = "http://localhost:8080/api/validate"; // Example API endpoint
        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl, file, String.class);
        return response;
    }
}
