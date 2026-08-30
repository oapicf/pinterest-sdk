package org.openapitools.server.api.model

import org.openapitools.server.api.model.SupplementalItemBatchOperationStatus
import org.openapitools.server.api.model.SupplementalOperationResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryItemsBatch(
    /** Id of the batch operation */
    val batchId: kotlin.String,
    /** Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss */
    val createdTime: java.time.OffsetDateTime,
    /** Array of operation results */
    val operationResults: kotlin.collections.List<SupplementalOperationResult>,
    /** Status of the batch: PROCESSING, COMPLETED, FAILED */
    val status: SupplementalItemBatchOperationStatus,
    /** Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss */
    val completedTime: java.time.OffsetDateTime? = null
)
