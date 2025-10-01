package com.mehedi.blooddonation.modules.notifications.repository;

import com.mehedi.blooddonation.modules.notifications.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
