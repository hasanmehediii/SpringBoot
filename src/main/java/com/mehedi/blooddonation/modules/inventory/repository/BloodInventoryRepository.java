package com.mehedi.blooddonation.modules.inventory.repository;

import com.mehedi.blooddonation.modules.inventory.model.BloodInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodInventoryRepository extends JpaRepository<BloodInventory, Long> {
}
