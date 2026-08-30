@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PacingDeliveryType {
    @JsonProperty(value = "STANDARD") STANDARD,
    @JsonProperty(value = "ACCELERATED") ACCELERATED,
}
