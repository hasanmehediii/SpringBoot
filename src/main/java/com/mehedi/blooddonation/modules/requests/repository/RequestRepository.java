package com.mehedi.blooddonation.modules.requests.repository;

import com.mehedi.blooddonation.modules.requests.model.BloodRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<BloodRequest, Long> {
}
