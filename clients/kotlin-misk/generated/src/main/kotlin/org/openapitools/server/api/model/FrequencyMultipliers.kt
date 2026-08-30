package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FrequencyMultipliers(
    /** Impression count identifier. */
    val IMPRESSION_COUNT: kotlin.String? = null
)
