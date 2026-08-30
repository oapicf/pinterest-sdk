package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningEstimationType
import org.openapitools.server.api.model.CampaignPlanningPointEstimate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningCurveEstimate(
    /** Estimation type for campaign planning estimated curve */
    val estimationType: CampaignPlanningEstimationType? = null,
    /** The estimation points that make up the estimated curve. */
    val points: kotlin.collections.List<CampaignPlanningPointEstimate>? = null
)
