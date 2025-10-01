package com.mehedi.blooddonation.modules.inventory.service;

import com.mehedi.blooddonation.modules.inventory.model.BloodInventory;
import com.mehedi.blooddonation.modules.inventory.repository.BloodInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodInventoryService {

    @Autowired
    private BloodInventoryRepository bloodInventoryRepository;

    public List<BloodInventory> getAllBloodInventory() {
        return bloodInventoryRepository.findAll();
    }
}
