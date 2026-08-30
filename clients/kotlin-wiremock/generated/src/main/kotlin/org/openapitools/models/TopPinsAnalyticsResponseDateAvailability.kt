@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TopPinsAnalyticsResponseDateAvailability(
    @field:JsonProperty("is_realtime")
    val isRealtime: kotlin.Boolean? = null,

    @field:JsonProperty("latest_available_timestamp")
    val latestAvailableTimestamp: java.math.BigDecimal? = null,

)
