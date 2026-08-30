@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningConfidenceLevelAlertReason {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "OTHER") OTHER,
    @JsonProperty(value = "ADVERTISER_HAS_NO_RECENT_CAMPAIGNS") ADVERTISER_HAS_NO_RECENT_CAMPAIGNS,
    @JsonProperty(value = "ADVERTISER_HAS_NO_RECENT_CONVERSIONS") ADVERTISER_HAS_NO_RECENT_CONVERSIONS,
}
