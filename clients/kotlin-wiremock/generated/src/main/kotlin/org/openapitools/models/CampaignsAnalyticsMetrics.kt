@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignsAnalyticsMetrics(
    @field:JsonProperty("CAMPAIGN_ID")
    val CAMPAIGN_ID: kotlin.String? = null,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
