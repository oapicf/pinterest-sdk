@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TopPinsAnalyticsResponse(
    @field:JsonProperty("date_availability")
    val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<TopPinsAnalyticsResponsePinsItems>? = null,

    @field:JsonProperty("sort_by")
    val sortBy: TopPinsSortBy? = null,

)
