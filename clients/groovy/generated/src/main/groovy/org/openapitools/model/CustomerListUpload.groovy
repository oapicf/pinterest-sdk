package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.WorkloadState;

@Canonical
class CustomerListUpload {
    /* Advertiser ID. */
    String adAccountId
    /* Customer List Upload creation_time. Epoch (seconds). */
    Integer creationTime
    /* ID of the customer list associated with this upload. */
    String customerListId
    /* Error counts by error code */
    List<ErrorDetail> errorCounts
    /* Customer List Upload ID. */
    String id
    
    UserListOperationType operation
    /* Record processing counts */
    RecordCounts recordCounts
    
    WorkloadState state
    /* Customer List Upload updated_time. Epoch (seconds). */
    Integer updatedTime
}
