@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AnalyticsMetricsResponse(
    @field:JsonProperty("daily_metrics")
    val dailyMetrics: kotlin.collections.List<AnalyticsDailyMetrics>? = null,

    @field:JsonProperty("summary_metrics")
    val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

)
