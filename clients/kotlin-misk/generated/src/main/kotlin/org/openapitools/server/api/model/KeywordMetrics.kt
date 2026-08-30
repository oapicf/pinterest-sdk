package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordMetrics(
    /** Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response */
    val keywordQueryVolume: kotlin.String? = null
)
