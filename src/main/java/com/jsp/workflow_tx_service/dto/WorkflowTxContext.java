package com.jsp.workflow_tx_service.dto;

import lombok.Data;
import java.util.Date;
import java.math.BigInteger;

@Data
public class WorkflowTxContext {

    private Date executionStart;
    private Date executionEnd;
    private String executionStatus;
    private String remarks;
    private String tenantId;
    private BigInteger workflowAltKey;
    private String txId;
    private String workflowId;
    private String workflowCode;
    private String entityName;
    private boolean newTx;
    private boolean resumeTx;
    private String resumeTxNodeId;
    private String resumeNodeResultStatus;
    private NodeConfig nextNodeConfig;
    private String uniqueField;

}