@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ItemAvailability {
    @JsonProperty(value = "in stock") in_stock,
    @JsonProperty(value = "out of stock") out_of_stock,
    @JsonProperty(value = "preorder") preorder,
}
