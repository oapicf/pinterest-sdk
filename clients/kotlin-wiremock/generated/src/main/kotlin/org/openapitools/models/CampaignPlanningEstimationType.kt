@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningEstimationType {
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "CLICK") CLICK,
    @JsonProperty(value = "CONVERSION") CONVERSION,
    @JsonProperty(value = "WEEKLY_FREQUENCY") WEEKLY_FREQUENCY,
    @JsonProperty(value = "WEEKLY_REACH") WEEKLY_REACH,
    @JsonProperty(value = "LIFETIME_FREQUENCY") LIFETIME_FREQUENCY,
    @JsonProperty(value = "LIFETIME_REACH") LIFETIME_REACH,
    @JsonProperty(value = "CPM") CPM,
    @JsonProperty(value = "CPC") CPC,
    @JsonProperty(value = "CPA") CPA,
}
