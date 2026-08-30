package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningConversionAttributionWindowDays
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningConversionAttribution(
    /** Number of days to use as the conversion attribution window for a pin click action. */
    val clickWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,
    /** Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. */
    val engagementWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,
    /** Number of days to use as the conversion attribution window for a view action. */
    val viewWindowDays: CampaignPlanningConversionAttributionWindowDays? = null
)
