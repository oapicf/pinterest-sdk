package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningBudgetRecommendationPoint
import org.openapitools.server.api.model.CampaignPlanningExperimentBudgetRecommendation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningBudgetRecommendation(
    /** The recommended budget amount. */
    val budgetRecommendation: kotlin.Int? = null,
    /** List of experimental budget recommendations. */
    val experimentCampaignBudgetRecommendation: kotlin.collections.List<CampaignPlanningExperimentBudgetRecommendation>? = null,
    /** Recommended number of days for the campaign lifetime. */
    val lifetimeDaysRecommendation: kotlin.Int? = null,
    /** List of point estimations for different budget scenarios. */
    val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null
)
