package org.openapitools.server.api.model

import org.openapitools.server.api.model.ErrorDetail
import org.openapitools.server.api.model.RecordCounts
import org.openapitools.server.api.model.UserListOperationType
import org.openapitools.server.api.model.WorkloadState
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerListUpload(
    /** Advertiser ID. */
    val adAccountId: kotlin.String,
    /** Customer List Upload creation_time. Epoch (seconds). */
    val creationTime: kotlin.Int,
    /** ID of the customer list associated with this upload. */
    val customerListId: kotlin.String,
    /** Customer List Upload ID. */
    val id: kotlin.String,
    val operation: UserListOperationType,
    val state: WorkloadState,
    /** Customer List Upload updated_time. Epoch (seconds). */
    val updatedTime: kotlin.Int,
    /** Error counts by error code */
    val errorCounts: kotlin.collections.List<ErrorDetail>? = null,
    /** Record processing counts */
    val recordCounts: RecordCounts? = null
)
