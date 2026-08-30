@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomConversionEventMetrics(
    @field:JsonProperty("custom_event_metrics_type")
    val customEventMetricsType: AdeColumnType,

    @field:JsonProperty("custom_event_name")
    val customEventName: kotlin.String,

)
