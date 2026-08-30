package org.openapitools.server.api.model

import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponseDateAvailability
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponsePinsItems
import org.openapitools.server.api.model.TopVideoPinsSortBy
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopVideoPinsAnalyticsResponse(
    val dateAvailability: TopVideoPinsAnalyticsResponseDateAvailability? = null,
    val pins: kotlin.collections.List<TopVideoPinsAnalyticsResponsePinsItems>? = null,
    val sortBy: TopVideoPinsSortBy? = null
)
