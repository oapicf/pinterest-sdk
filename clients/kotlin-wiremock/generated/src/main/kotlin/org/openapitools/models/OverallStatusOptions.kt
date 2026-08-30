@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OverallStatusOptions {
    @JsonProperty(value = "NEEDS_IMPROVEMENT") NEEDS_IMPROVEMENT,
    @JsonProperty(value = "FAIR") FAIR,
    @JsonProperty(value = "GOOD") GOOD,
}
