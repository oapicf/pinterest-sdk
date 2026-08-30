@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class Order {
    @JsonProperty(value = "ASCENDING") ASCENDING,
    @JsonProperty(value = "DESCENDING") DESCENDING,
}
