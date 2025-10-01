package com.mehedi.blooddonation.modules.inventory.controller;

import com.mehedi.blooddonation.modules.inventory.model.BloodInventory;
import com.mehedi.blooddonation.modules.inventory.service.BloodInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blood-inventory")
public class BloodInventoryController {

    @Autowired
    private BloodInventoryService bloodInventoryService;

    @GetMapping
    public List<BloodInventory> getAllBloodInventory() {
        return bloodInventoryService.getAllBloodInventory();
    }
}
