package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkRequestStatus;

@Canonical
class BulkJobData {
    /* Presigned s3 file url for the bulk request result. */
    String resultUrl
    
    BulkRequestStatus status
    /* Bulk Workload Id. */
    Integer workloadId
}
