package com.mehedi.blooddonation.modules.audit.service;

import com.mehedi.blooddonation.modules.audit.model.AuditLog;
import com.mehedi.blooddonation.modules.audit.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogService {

    @Autowired
    private AuditLogRepository auditLogRepository;

    public List<AuditLog> getAllAuditLogs() {
        return auditLogRepository.findAll();
    }
}
