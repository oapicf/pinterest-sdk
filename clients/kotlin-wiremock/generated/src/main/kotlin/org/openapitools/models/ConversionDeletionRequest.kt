@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionDeletionRequest(
    @field:JsonProperty("created_time")
    val createdTime: java.time.LocalDate,

    @field:JsonProperty("request_id")
    val requestId: kotlin.String,

    @field:JsonProperty("status")
    val status: ConversionDeletionRequestStatus,

    @field:JsonProperty("processed_time")
    val processedTime: java.time.LocalDate? = null,

)
