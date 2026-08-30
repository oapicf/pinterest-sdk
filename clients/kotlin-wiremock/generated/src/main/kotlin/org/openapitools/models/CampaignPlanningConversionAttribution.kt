@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningConversionAttribution(
    @field:JsonProperty("click_window_days")
    val clickWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,

    @field:JsonProperty("engagement_window_days")
    val engagementWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,

    @field:JsonProperty("view_window_days")
    val viewWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,

)
