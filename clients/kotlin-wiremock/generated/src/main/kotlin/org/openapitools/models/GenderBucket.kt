@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class GenderBucket {
    @JsonProperty(value = "MALE") MALE,
    @JsonProperty(value = "FEMALE") FEMALE,
    @JsonProperty(value = "UNSPECIFIED") UNSPECIFIED,
}
