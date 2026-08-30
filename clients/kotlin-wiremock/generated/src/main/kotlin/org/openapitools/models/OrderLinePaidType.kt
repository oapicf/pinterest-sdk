@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderLinePaidType {
    @JsonProperty(value = "PAID") PAID,
    @JsonProperty(value = "BONUS") BONUS,
    @JsonProperty(value = "MAKE_GOOD") MAKE_GOOD,
    @JsonProperty(value = "TEST") TEST,
}
