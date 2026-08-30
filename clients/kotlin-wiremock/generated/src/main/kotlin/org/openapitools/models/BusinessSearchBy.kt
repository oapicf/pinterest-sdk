@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BusinessSearchBy {
    @JsonProperty(value = "FULL_NAME") FULL_NAME,
    @JsonProperty(value = "USERNAME") USERNAME,
    @JsonProperty(value = "BUSINESS_ID") BUSINESS_ID,
    @JsonProperty(value = "EMAIL") EMAIL,
}
