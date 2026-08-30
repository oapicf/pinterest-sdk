package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionDeletionRequestStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionDeletionRequest(
    /** Timestamp when the conversion deletion request was succesfully created. */
    val createdTime: java.time.LocalDate,
    /** Unique identifier of the conversion deletion request */
    val requestId: kotlin.String,
    /** Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. */
    val status: ConversionDeletionRequestStatus,
    /** Timestamp when the conversion deletion request was processed. */
    val processedTime: java.time.LocalDate? = null
)
