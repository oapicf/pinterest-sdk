@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MetricsResponseDataItems(
    @field:JsonProperty("metrics")
    val metrics: kotlin.Any,

    @field:JsonProperty("targeting_type")
    val targetingType: kotlin.String,

    @field:JsonProperty("targeting_value")
    val targetingValue: kotlin.String,

)
