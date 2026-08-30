@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionApiResponseEventsItems(
    @field:JsonProperty("status")
    val status: EventProcessingStatus,

    @field:JsonProperty("error_message")
    val errorMessage: kotlin.String? = null,

    @field:JsonProperty("warning_message")
    val warningMessage: kotlin.String? = null,

)
