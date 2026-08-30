package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningConversionAttribution
import org.openapitools.server.api.model.CampaignPlanningConversionEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningConversionRate(
    val attributionWindows: CampaignPlanningConversionAttribution,
    val conversionEvent: CampaignPlanningConversionEvent,
    /** Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. */
    val conversionRate: kotlin.Float
)
