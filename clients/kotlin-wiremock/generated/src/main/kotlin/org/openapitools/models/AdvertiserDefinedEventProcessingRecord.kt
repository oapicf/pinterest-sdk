@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserDefinedEventProcessingRecord(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<kotlin.String>? = null,

)
