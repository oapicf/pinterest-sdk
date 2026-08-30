@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignDeliveryEstimatesResponse(
    @field:JsonProperty("curves")
    val curves: kotlin.collections.List<CampaignPlanningCurveEstimate>? = null,

    @field:JsonProperty("derived_metrics")
    val derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics? = null,

    @field:JsonProperty("max_potential_spend")
    val maxPotentialSpend: kotlin.Int? = null,

)
