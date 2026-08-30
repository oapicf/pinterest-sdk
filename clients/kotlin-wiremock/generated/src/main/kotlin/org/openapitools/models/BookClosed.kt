@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BookClosed(
    @field:JsonProperty("conversion_metrics_ready")
    val conversionMetricsReady: kotlin.Boolean,

    @field:JsonProperty("non_conversion_metrics_ready")
    val nonConversionMetricsReady: kotlin.Boolean,

)
