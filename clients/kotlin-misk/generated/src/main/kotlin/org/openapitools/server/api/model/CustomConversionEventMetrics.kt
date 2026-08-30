package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdeColumnType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomConversionEventMetrics(
    val customEventMetricsType: AdeColumnType,
    /** Name of the advertiser-defined custom conversion event */
    val customEventName: kotlin.String
)
