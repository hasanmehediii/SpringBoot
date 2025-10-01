package com.mehedi.blooddonation.modules.requests.service;

import com.mehedi.blooddonation.modules.requests.model.BloodRequest;
import com.mehedi.blooddonation.modules.requests.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<BloodRequest> getAllBloodRequests() {
        return requestRepository.findAll();
    }
}
