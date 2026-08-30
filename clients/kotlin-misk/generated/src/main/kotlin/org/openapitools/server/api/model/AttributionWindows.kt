package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AttributionWindows(
    val clickWindowDays: kotlin.Int? = null,
    val engagementWindowDays: kotlin.Int? = null,
    val viewWindowDays: kotlin.Int? = null
)
