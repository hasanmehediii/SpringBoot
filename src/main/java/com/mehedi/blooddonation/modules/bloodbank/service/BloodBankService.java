package com.mehedi.blooddonation.modules.bloodbank.service;

import com.mehedi.blooddonation.modules.bloodbank.model.BloodBank;
import com.mehedi.blooddonation.modules.bloodbank.repository.BloodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodBankService {

    @Autowired
    private BloodBankRepository bloodBankRepository;

    public List<BloodBank> getAllBloodBanks() {
        return bloodBankRepository.findAll();
    }
}
