@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FilterOperatorType {
    @JsonProperty(value = "IS") IS,
    @JsonProperty(value = "CONTAINS") CONTAINS,
}
