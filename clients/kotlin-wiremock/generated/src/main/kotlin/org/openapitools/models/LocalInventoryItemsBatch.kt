@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalInventoryItemsBatch(
    @field:JsonProperty("batch_id")
    val batchId: kotlin.String,

    @field:JsonProperty("created_time")
    val createdTime: java.time.OffsetDateTime,

    @field:JsonProperty("operation_results")
    val operationResults: kotlin.collections.List<SupplementalOperationResult>,

    @field:JsonProperty("status")
    val status: SupplementalItemBatchOperationStatus,

    @field:JsonProperty("completed_time")
    val completedTime: java.time.OffsetDateTime? = null,

)
