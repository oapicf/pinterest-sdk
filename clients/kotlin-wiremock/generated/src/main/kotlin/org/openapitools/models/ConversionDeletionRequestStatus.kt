@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionDeletionRequestStatus {
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "SUBMITTED") SUBMITTED,
    @JsonProperty(value = "CANCELLED") CANCELLED,
}
