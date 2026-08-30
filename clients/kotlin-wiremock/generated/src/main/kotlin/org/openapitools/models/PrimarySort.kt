@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PrimarySort {
    @JsonProperty(value = "BY_ID") BY_ID,
    @JsonProperty(value = "BY_DATE") BY_DATE,
}
