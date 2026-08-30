@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsAnalytics(
    @field:JsonProperty("AD_ID")
    val AD_ID: kotlin.String,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
