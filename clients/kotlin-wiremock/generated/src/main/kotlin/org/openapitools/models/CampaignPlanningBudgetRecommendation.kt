@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningBudgetRecommendation(
    @field:JsonProperty("budget_recommendation")
    val budgetRecommendation: kotlin.Int? = null,

    @field:JsonProperty("experiment_campaign_budget_recommendation")
    val experimentCampaignBudgetRecommendation: kotlin.collections.List<CampaignPlanningExperimentBudgetRecommendation>? = null,

    @field:JsonProperty("lifetime_days_recommendation")
    val lifetimeDaysRecommendation: kotlin.Int? = null,

    @field:JsonProperty("point_estimations")
    val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null,

)
