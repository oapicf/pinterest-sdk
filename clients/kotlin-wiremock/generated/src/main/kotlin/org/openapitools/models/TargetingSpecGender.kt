@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TargetingSpecGender {
    @JsonProperty(value = "unknown") unknown,
    @JsonProperty(value = "male") male,
    @JsonProperty(value = "female") female,
}
