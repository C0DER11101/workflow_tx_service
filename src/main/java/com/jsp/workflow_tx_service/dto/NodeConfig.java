package com.jsp.workflow_tx_service.dto;

import lombok.Data;

import java.util.Map;
import java.util.List;

@Data
public class NodeConfig {

    Map<String, String> nodeProperties;
	String nodeId;
	String nodeType;
	List<String> outgoingNodes;
	List<String> incomingNodes;
	NodeConfig sourceNodeConfig;
	boolean isStartNode;
	boolean isEndNode;

}