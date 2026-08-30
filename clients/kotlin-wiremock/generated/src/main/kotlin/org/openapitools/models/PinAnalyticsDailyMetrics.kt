@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinAnalyticsDailyMetrics(
    @field:JsonProperty("data_status")
    val dataStatus: DataStatus? = null,

    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    @field:JsonProperty("metrics")
    val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

)
