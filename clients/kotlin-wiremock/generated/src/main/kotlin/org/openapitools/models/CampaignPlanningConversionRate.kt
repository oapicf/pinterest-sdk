@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningConversionRate(
    @field:JsonProperty("attribution_windows")
    val attributionWindows: CampaignPlanningConversionAttribution,

    @field:JsonProperty("conversion_event")
    val conversionEvent: CampaignPlanningConversionEvent,

    @field:JsonProperty("conversion_rate")
    val conversionRate: kotlin.Float,

)
