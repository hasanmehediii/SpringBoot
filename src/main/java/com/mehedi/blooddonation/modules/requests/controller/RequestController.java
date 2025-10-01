package com.mehedi.blooddonation.modules.requests.controller;

import com.mehedi.blooddonation.modules.requests.model.BloodRequest;
import com.mehedi.blooddonation.modules.requests.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blood-requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping
    public List<BloodRequest> getAllBloodRequests() {
        return requestService.getAllBloodRequests();
    }
}
