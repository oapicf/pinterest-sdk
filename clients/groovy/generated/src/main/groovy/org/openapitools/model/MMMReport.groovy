package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;

@Canonical
class MMMReport {
    
    String message
    
    BulkReportingJobStatus reportStatus
    
    BigDecimal size
    
    String status
    
    String token
    
    String url
}
