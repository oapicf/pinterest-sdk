@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinAnalyticsMetricsResponse(
    @field:JsonProperty("daily_metrics")
    val dailyMetrics: kotlin.collections.List<PinAnalyticsDailyMetrics>? = null,

    @field:JsonProperty("lifetime_metrics")
    val lifetimeMetrics: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @field:JsonProperty("summary_metrics")
    val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

)
