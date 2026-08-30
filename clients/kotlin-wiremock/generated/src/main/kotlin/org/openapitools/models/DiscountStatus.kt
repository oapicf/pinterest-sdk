@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class DiscountStatus {
    @JsonProperty(value = "OTHER") OTHER,
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "SCHEDULED") SCHEDULED,
    @JsonProperty(value = "EXPIRED") EXPIRED,
}
