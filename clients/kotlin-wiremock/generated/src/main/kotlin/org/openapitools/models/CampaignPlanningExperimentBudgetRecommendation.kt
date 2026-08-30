@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningExperimentBudgetRecommendation(
    @field:JsonProperty("budget_recommendation")
    val budgetRecommendation: kotlin.Int? = null,

    @field:JsonProperty("lifetime_days_recommendation")
    val lifetimeDaysRecommendation: kotlin.Int? = null,

    @field:JsonProperty("point_estimations")
    val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null,

    @field:JsonProperty("version_id")
    val versionId: kotlin.String? = null,

)
