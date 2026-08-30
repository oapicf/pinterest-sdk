@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class InviteFilterStatus {
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "EXPIRED") EXPIRED,
}
