@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningConfidenceLevelAlertSeverity {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "LOW_MILD") LOW_MILD,
    @JsonProperty(value = "LOW_MODERATE") LOW_MODERATE,
    @JsonProperty(value = "LOW_SEVERE") LOW_SEVERE,
}
