package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;

@Canonical
class ConversionProductReport {
    /* Message returned from the create report request */
    String message
    /* Async report status */
    BulkReportingJobStatus reportStatus
    /* Size of the report in bytes */
    BigDecimal size
    /* Token returned from the create report request */
    String token
    /* URL of the report */
    String url
}
