package com.mehedi.blooddonation.modules.donors.service;

import com.mehedi.blooddonation.modules.donors.model.Donor;
import com.mehedi.blooddonation.modules.donors.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }
}
