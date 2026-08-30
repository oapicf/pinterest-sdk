package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopPinsAnalyticsResponseDateAvailability(
    val isRealtime: kotlin.Boolean? = null,
    val latestAvailableTimestamp: java.math.BigDecimal? = null
)
