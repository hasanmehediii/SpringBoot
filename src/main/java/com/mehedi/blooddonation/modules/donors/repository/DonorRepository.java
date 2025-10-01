package com.mehedi.blooddonation.modules.donors.repository;

import com.mehedi.blooddonation.modules.donors.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {
}
