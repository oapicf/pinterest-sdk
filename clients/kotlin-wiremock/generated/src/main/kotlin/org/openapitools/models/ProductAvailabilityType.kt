@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductAvailabilityType {
    @JsonProperty(value = "IN_STOCK") IN_STOCK,
    @JsonProperty(value = "OUT_OF_STOCK") OUT_OF_STOCK,
    @JsonProperty(value = "PREORDER") PREORDER,
}
