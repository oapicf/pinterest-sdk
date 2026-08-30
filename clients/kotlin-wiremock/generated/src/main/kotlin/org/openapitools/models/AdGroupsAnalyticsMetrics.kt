@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupsAnalyticsMetrics(
    @field:JsonProperty("AD_GROUP_ID")
    val AD_GROUP_ID: kotlin.String? = null,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
