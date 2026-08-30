package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignDeliveryEstimatesDerivedMetrics
import org.openapitools.server.api.model.CampaignPlanningCurveEstimate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignDeliveryEstimatesResponse(
    /** Estimated curves. Each curve will pertain to a single estimation type. */
    val curves: kotlin.collections.List<CampaignPlanningCurveEstimate>? = null,
    val derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics? = null,
    /** Maximum potential spend estimate. */
    val maxPotentialSpend: kotlin.Int? = null
)
