package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalOperationResult;

@Canonical
class LocalInventoryItemsBatch {
    /* Id of the batch operation */
    String batchId
    /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    Date completedTime
    /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    Date createdTime
    /* Array of operation results */
    List<SupplementalOperationResult> operationResults = new ArrayList<>()
    /* Status of the batch: PROCESSING, COMPLETED, FAILED */
    SupplementalItemBatchOperationStatus status
}
