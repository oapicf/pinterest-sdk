package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleAudienceMultipliers(
    val AUDIENCE_ID: kotlin.String? = null
)
