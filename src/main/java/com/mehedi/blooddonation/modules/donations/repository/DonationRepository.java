package com.mehedi.blooddonation.modules.donations.repository;

import com.mehedi.blooddonation.modules.donations.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
}
