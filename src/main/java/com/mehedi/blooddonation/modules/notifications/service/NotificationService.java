package com.mehedi.blooddonation.modules.notifications.service;

import com.mehedi.blooddonation.modules.notifications.model.Notification;
import com.mehedi.blooddonation.modules.notifications.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
