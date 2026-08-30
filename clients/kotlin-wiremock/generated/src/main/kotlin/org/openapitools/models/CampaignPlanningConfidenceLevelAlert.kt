@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningConfidenceLevelAlert(
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("reason")
    val reason: CampaignPlanningConfidenceLevelAlertReason? = null,

    @field:JsonProperty("severity")
    val severity: CampaignPlanningConfidenceLevelAlertSeverity? = null,

)
