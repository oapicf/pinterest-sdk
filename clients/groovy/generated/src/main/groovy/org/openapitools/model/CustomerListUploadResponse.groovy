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

@Canonical
class CustomerListUploadResponse {
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
    
    RecordCounts recordCounts

    enum StateEnum {
    
        NOT_STARTED("NOT_STARTED"),
        
        RUNNING("RUNNING"),
        
        PAUSED("PAUSED"),
        
        SUCCEEDED("SUCCEEDED"),
        
        FAILED("FAILED")
    
        private final String value
    
        StateEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Workload processing state */
    StateEnum state
    /* Customer List Upload updated_time. Epoch (seconds). */
    Integer updatedTime
}
