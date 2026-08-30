package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinAnalyticsDailyMetrics
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinAnalyticsMetricsResponse(
    /** Array with the requested daily metric records */
    val dailyMetrics: kotlin.collections.List<PinAnalyticsDailyMetrics>? = null,
    /** The lifetime metric name and value. */
    val lifetimeMetrics: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,
    /** The metric name and value over the requested period for each requested metric */
    val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
)
