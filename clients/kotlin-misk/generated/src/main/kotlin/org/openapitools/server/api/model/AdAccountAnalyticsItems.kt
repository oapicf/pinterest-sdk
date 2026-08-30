package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountAnalyticsItems(
    val AD_ACCOUNT_ID: kotlin.String,
    val DATE: java.time.LocalDate? = null
)
