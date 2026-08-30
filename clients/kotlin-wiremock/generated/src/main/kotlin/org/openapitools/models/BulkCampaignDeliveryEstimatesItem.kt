@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkCampaignDeliveryEstimatesItem(
    @field:JsonProperty("adgroup_audience_sizes")
    val adgroupAudienceSizes: kotlin.collections.List<CampaignPlanningAdGroupAudienceSize>? = null,

    @field:JsonProperty("conversion_rate")
    val conversionRate: kotlin.Float? = null,

    @field:JsonProperty("conversion_rates")
    val conversionRates: kotlin.collections.List<CampaignPlanningConversionRate>? = null,

    @field:JsonProperty("curves")
    val curves: kotlin.collections.List<CampaignPlanningCurveEstimate>? = null,

    @field:JsonProperty("derived_metrics")
    val derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics? = null,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<CampaignPlanningResponseError>? = null,

    @field:JsonProperty("estimate_id")
    val estimateId: kotlin.String? = null,

    @field:JsonProperty("max_potential_spend")
    val maxPotentialSpend: kotlin.Int? = null,

)
