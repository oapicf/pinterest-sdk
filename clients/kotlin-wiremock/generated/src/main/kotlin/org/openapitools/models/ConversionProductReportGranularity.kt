@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionProductReportGranularity {
    @JsonProperty(value = "TOTAL") TOTAL,
    @JsonProperty(value = "WEEK") WEEK,
    @JsonProperty(value = "MONTH") MONTH,
}
