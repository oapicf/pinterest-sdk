@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class UserAccountType {
    @JsonProperty(value = "PINNER") PINNER,
    @JsonProperty(value = "BUSINESS") BUSINESS,
}
