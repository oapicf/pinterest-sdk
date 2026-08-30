@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductCondition {
    @JsonProperty(value = "NEW") NEW,
    @JsonProperty(value = "USED") USED,
    @JsonProperty(value = "REFURBISHED") REFURBISHED,
}
