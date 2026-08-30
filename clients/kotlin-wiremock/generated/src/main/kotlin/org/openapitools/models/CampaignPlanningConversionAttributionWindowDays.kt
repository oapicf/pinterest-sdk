@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningConversionAttributionWindowDays {
    @JsonProperty(value = "DAYS_0") DAYS_0,
    @JsonProperty(value = "DAYS_1") DAYS_1,
    @JsonProperty(value = "DAYS_7") DAYS_7,
    @JsonProperty(value = "DAYS_30") DAYS_30,
    @JsonProperty(value = "DAYS_60") DAYS_60,
}
