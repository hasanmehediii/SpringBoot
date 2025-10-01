package com.mehedi.blooddonation.modules.donations.service;

import com.mehedi.blooddonation.modules.donations.model.Donation;
import com.mehedi.blooddonation.modules.donations.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }
}
