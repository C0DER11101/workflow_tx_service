package com.jsp.workflow_tx_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public class AuditModel {

    @Column(name = "remarks")
    private Date createdDate;

    @Column(name = "remarks")
    private String createdBy;

    @Column(name = "remarks")
    private  Date modifiedDate;

    @Column(name = "modified_by")
    private  String modifiedBy;

}