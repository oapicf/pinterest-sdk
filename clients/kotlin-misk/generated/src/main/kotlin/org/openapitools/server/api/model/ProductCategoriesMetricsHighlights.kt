package org.openapitools.server.api.model

import org.openapitools.server.api.model.InnerProductCategoriesMetricsHighlights
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductCategoriesMetricsHighlights(
    /** Engagement metric value */
    val engagement: InnerProductCategoriesMetricsHighlights? = null,
    /** Number of outbound clicks */
    val outboundClicks: InnerProductCategoriesMetricsHighlights? = null,
    /** Number of pin saves */
    val pinSaves: InnerProductCategoriesMetricsHighlights? = null
)
