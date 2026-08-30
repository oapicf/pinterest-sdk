@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class NumericFilterOperatorType {
    @JsonProperty(value = "GREATER_THAN") GREATER_THAN,
    @JsonProperty(value = "GREATER_THAN_OR_EQUALS") GREATER_THAN_OR_EQUALS,
    @JsonProperty(value = "LESS_THAN") LESS_THAN,
    @JsonProperty(value = "LESS_THAN_OR_EQUALS") LESS_THAN_OR_EQUALS,
}
