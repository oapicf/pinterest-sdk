package org.openapitools.server.api.model

import org.openapitools.server.api.model.MetricsResponseDataItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MetricsResponse(
    val `data`: kotlin.collections.List<MetricsResponseDataItems>? = null
)
