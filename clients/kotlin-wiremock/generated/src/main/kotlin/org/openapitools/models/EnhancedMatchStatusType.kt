@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class EnhancedMatchStatusType {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "NOT_VALIDATED") NOT_VALIDATED,
    @JsonProperty(value = "VALIDATING_IN_PROGRESS") VALIDATING_IN_PROGRESS,
    @JsonProperty(value = "VALIDATION_COMPLETE") VALIDATION_COMPLETE,
}
