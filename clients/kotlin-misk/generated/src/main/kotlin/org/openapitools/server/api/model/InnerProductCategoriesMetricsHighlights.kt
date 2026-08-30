package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InnerProductCategoriesMetricsHighlights(
    /** Month-over-month percentage change */
    val pctChangeMom: java.math.BigDecimal
)
