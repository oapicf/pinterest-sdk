@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CatalogsFeedProcessingStatus {
    @JsonProperty(value = "COMPLETED") COMPLETED,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "PROCESSING") PROCESSING,
}
