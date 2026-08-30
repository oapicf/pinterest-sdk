@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ItemProcessingStatus {
    @JsonProperty(value = "SUCCESS") SUCCESS,
    @JsonProperty(value = "FAILURE") FAILURE,
    @JsonProperty(value = "PROCESSING") PROCESSING,
}
