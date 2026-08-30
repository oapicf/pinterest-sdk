@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningCurveEstimate(
    @field:JsonProperty("estimation_type")
    val estimationType: CampaignPlanningEstimationType? = null,

    @field:JsonProperty("points")
    val points: kotlin.collections.List<CampaignPlanningPointEstimate>? = null,

)
