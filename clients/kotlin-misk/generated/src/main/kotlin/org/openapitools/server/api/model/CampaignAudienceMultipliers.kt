package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAudienceMultipliers(
    /** Audience ID for the multiplier. */
    val AUDIENCE_ID: kotlin.String? = null
)
