@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdPinAnalytics(
    @field:JsonProperty("PIN_ID")
    val PIN_ID: kotlin.String,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
