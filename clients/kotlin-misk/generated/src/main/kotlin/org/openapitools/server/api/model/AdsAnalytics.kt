package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsAnalytics(
    val AD_ID: kotlin.String,
    val DATE: java.time.LocalDate? = null
)
