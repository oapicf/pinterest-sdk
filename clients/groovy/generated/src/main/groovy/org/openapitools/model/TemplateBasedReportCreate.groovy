package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkReportingJobStatus;

@Canonical
class TemplateBasedReportCreate {
    
    String message
    
    BulkReportingJobStatus reportStatus
    
    String token
}
