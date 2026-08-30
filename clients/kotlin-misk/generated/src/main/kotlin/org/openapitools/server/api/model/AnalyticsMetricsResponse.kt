package org.openapitools.server.api.model

import org.openapitools.server.api.model.AnalyticsDailyMetrics
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AnalyticsMetricsResponse(
    /** Array with the requested daily metric records */
    val dailyMetrics: kotlin.collections.List<AnalyticsDailyMetrics>? = null,
    /** The metric name and value over the requested period for each requested metric */
    val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
)
