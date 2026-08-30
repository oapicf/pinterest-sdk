@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TopVideoPinsAnalyticsResponsePinsItems(
    @field:JsonProperty("data_status")
    val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    @field:JsonProperty("metrics")
    val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.String? = null,

)
