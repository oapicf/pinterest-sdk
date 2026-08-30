package org.openapitools.server.api.model

import org.openapitools.server.api.model.DataStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopVideoPinsAnalyticsResponsePinsItems(
    val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,
    val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,
    /** The pin id */
    val pinId: kotlin.String? = null
)
