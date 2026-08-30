package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningEstimationType
import org.openapitools.server.api.model.CampaignPlanningPointEstimate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningBudgetRecommendationPoint(
    /** Estimation type for this point. */
    val estimationType: CampaignPlanningEstimationType? = null,
    /** Point estimate data. */
    val pointEstimate: CampaignPlanningPointEstimate? = null
)
