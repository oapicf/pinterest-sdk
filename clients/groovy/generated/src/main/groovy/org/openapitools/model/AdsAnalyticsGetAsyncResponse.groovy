package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BulkReportingJobStatus;

@Canonical
class AdsAnalyticsGetAsyncResponse {
    
    BulkReportingJobStatus reportStatus
    
    String url
    
    BigDecimal size
}
