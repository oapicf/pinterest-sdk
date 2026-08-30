@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class InviteStatus {
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "ACCEPTED") ACCEPTED,
    @JsonProperty(value = "DECLINED") DECLINED,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "EXPIRED") EXPIRED,
}
