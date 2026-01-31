package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkReportingJobStatus;

@Canonical
class TemplateBasedReport {
    
    String message
    
    BulkReportingJobStatus reportStatus
    /* Unique identifier of a template. */
    String templateId
    
    String token
}
