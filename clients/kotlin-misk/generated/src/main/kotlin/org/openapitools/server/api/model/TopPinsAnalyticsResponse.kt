package org.openapitools.server.api.model

import org.openapitools.server.api.model.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.server.api.model.TopPinsAnalyticsResponsePinsItems
import org.openapitools.server.api.model.TopPinsSortBy
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopPinsAnalyticsResponse(
    val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,
    val pins: kotlin.collections.List<TopPinsAnalyticsResponsePinsItems>? = null,
    val sortBy: TopPinsSortBy? = null
)
