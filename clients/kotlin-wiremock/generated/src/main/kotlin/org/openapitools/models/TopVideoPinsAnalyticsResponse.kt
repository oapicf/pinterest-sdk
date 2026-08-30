@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TopVideoPinsAnalyticsResponse(
    @field:JsonProperty("date_availability")
    val dateAvailability: TopVideoPinsAnalyticsResponseDateAvailability? = null,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<TopVideoPinsAnalyticsResponsePinsItems>? = null,

    @field:JsonProperty("sort_by")
    val sortBy: TopVideoPinsSortBy? = null,

)
