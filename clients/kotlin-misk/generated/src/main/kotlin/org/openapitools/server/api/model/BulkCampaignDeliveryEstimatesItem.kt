package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignDeliveryEstimatesDerivedMetrics
import org.openapitools.server.api.model.CampaignPlanningAdGroupAudienceSize
import org.openapitools.server.api.model.CampaignPlanningConversionRate
import org.openapitools.server.api.model.CampaignPlanningCurveEstimate
import org.openapitools.server.api.model.CampaignPlanningResponseError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkCampaignDeliveryEstimatesItem(
    /** Range audience sizes for each ad group, in the same order as the ad groups in the request. */
    val adgroupAudienceSizes: kotlin.collections.List<CampaignPlanningAdGroupAudienceSize>? = null,
    /** Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. */
    val conversionRate: kotlin.Float? = null,
    /** Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. */
    val conversionRates: kotlin.collections.List<CampaignPlanningConversionRate>? = null,
    /** Estimated curves. Each curve will pertain to a single estimation type. */
    val curves: kotlin.collections.List<CampaignPlanningCurveEstimate>? = null,
    val derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics? = null,
    /** Errors encountered during estimation for this campaign. */
    val errors: kotlin.collections.List<CampaignPlanningResponseError>? = null,
    /** UUID used to track delivery estimates when they are generated as part of a saved campaign. */
    val estimateId: kotlin.String? = null,
    /** Maximum potential spend estimate. */
    val maxPotentialSpend: kotlin.Int? = null
)
