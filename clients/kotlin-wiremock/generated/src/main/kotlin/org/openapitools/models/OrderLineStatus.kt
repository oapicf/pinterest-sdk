@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderLineStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "DELETED") DELETED,
}
