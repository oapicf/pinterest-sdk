@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountAnalyticsItems(
    @field:JsonProperty("AD_ACCOUNT_ID")
    val AD_ACCOUNT_ID: kotlin.String,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
