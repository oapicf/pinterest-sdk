@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class Gender {
    @JsonProperty(value = "FEMALE") FEMALE,
    @JsonProperty(value = "MALE") MALE,
    @JsonProperty(value = "UNISEX") UNISEX,
}
