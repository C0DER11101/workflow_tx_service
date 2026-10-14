package com.jsp.workflow_tx_service.repository;

import com.jsp.workflow_tx_service.model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, Integer> {
}