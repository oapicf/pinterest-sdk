package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequestStatus;

@Canonical
class ConversionDeletionRequest {
    /* Timestamp when the conversion deletion request was succesfully created. */
    Date createdTime
    /* Timestamp when the conversion deletion request was processed. */
    Date processedTime
    /* Unique identifier of the conversion deletion request */
    String requestId
    /* Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. */
    ConversionDeletionRequestStatus status
}
