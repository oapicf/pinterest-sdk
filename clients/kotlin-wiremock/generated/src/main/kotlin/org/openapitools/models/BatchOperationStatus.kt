@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BatchOperationStatus {
    @JsonProperty(value = "PROCESSING") PROCESSING,
    @JsonProperty(value = "COMPLETED") COMPLETED,
    @JsonProperty(value = "FAILED") FAILED,
}
