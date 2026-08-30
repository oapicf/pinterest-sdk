@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class Granularity {
    @JsonProperty(value = "TOTAL") TOTAL,
    @JsonProperty(value = "DAY") DAY,
    @JsonProperty(value = "HOUR") HOUR,
    @JsonProperty(value = "WEEK") WEEK,
    @JsonProperty(value = "MONTH") MONTH,
}
