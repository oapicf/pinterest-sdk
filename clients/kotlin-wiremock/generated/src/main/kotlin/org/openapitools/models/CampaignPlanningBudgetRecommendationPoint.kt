@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningBudgetRecommendationPoint(
    @field:JsonProperty("estimation_type")
    val estimationType: CampaignPlanningEstimationType? = null,

    @field:JsonProperty("point_estimate")
    val pointEstimate: CampaignPlanningPointEstimate? = null,

)
