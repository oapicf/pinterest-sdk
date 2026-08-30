@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CustomerListStatus {
    @JsonProperty(value = "PROCESSING") PROCESSING,
    @JsonProperty(value = "READY") READY,
    @JsonProperty(value = "TOO_SMALL") TOO_SMALL,
    @JsonProperty(value = "UPLOADING") UPLOADING,
}
