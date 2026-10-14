package com.jsp.workflow_tx_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;
import java.util.Date;

@Data
@Entity
@Table(name = "tx_log_model")
public class TransactionLogModel extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_key")
    private int altKey;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "tenant_id")
    private String txId;

    @Column(name = "tenant_id")
    private String txUniqueVal;

    @Column(name = "tenant_id")
    private String workflowId;

    @Column(name = "tenant_id")
    private String currentNodeId;

    @Column(name = "tenant_id")
    private String currentNodeType;

    @Column(name = "tenant_id")
    private String statusFlag;

    @Column(name = "tenant_id")
    private String executionSignal;

    @Column(name = "tenant_id")
    private Map<String, String> processVariableDataMap;

    @Column(name = "tenant_id")
    private Date triggerDate;

    @Column(name = "tenant_id")
    @Temporal(TemporalType.DATE)
    private Date txStartDate;

    @Column(name = "tenant_id")
    @Temporal(TemporalType.DATE)
    private Date txEndDate;

}