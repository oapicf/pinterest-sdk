@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TrendsGenderFilter {
    @JsonProperty(value = "male") male,
    @JsonProperty(value = "female") female,
    @JsonProperty(value = "unknown") unknown,
}
