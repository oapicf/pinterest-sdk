package org.openapitools.server.api.model

import org.openapitools.server.api.model.DataStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinAnalyticsDailyMetrics(
    val dataStatus: DataStatus? = null,
    /** Metrics date (UTC): YYYY-MM-DD. */
    val date: kotlin.String? = null,
    val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
)
