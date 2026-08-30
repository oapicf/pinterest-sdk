package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningBudgetRecommendationPoint
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningExperimentBudgetRecommendation(
    /** Recommended budget for this experiment version. */
    val budgetRecommendation: kotlin.Int? = null,
    /** Recommended lifetime days for this experiment. */
    val lifetimeDaysRecommendation: kotlin.Int? = null,
    /** Point estimations for this experiment version. */
    val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null,
    /** Version identifier for the experiment. */
    val versionId: kotlin.String? = null
)
