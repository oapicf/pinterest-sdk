package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordMetrics
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordMetricsResponse(
    /** Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot; */
    val keyword: kotlin.String? = null,
    val metrics: KeywordMetrics? = null
)
