package com.jsp.workflow_tx_service.repository;

import com.jsp.workflow_tx_service.model.TransactionLogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLogRepository extends JpaRepository<TransactionLogModel, Integer> {
}