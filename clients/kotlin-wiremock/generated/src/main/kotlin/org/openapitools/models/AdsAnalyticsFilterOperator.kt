@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdsAnalyticsFilterOperator {
    @JsonProperty(value = "LESS_THAN") LESS_THAN,
    @JsonProperty(value = "GREATER_THAN") GREATER_THAN,
}
