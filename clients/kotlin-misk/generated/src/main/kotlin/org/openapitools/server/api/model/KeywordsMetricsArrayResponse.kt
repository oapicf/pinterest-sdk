package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordMetricsResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsMetricsArrayResponse(
    val `data`: kotlin.collections.List<KeywordMetricsResponse>? = null
)
