package com.mehedi.blooddonation.modules.bloodbank.repository;

import com.mehedi.blooddonation.modules.bloodbank.model.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {
}
