package com.jsp.workflow_tx_service.dto;

import lombok.Data;

import java.util.Map;
import java.util.List;

@Data
public class NodeConfig {

    private Map<String, String> nodeProperties;
	private String nodeId;
	private String nodeType;
	private List<String> outgoingNodes;
	private List<String> incomingNodes;
	private NodeConfig sourceNodeConfig;
	private boolean isStartNode;
	private boolean isEndNode;

}