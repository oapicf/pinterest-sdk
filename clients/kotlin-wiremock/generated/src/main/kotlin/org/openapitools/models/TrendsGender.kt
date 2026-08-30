@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TrendsGender {
    @JsonProperty(value = "male") male,
    @JsonProperty(value = "female") female,
    @JsonProperty(value = "unspecified") unspecified,
}
