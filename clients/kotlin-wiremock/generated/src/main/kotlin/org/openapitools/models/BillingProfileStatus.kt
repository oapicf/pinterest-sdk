@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingProfileStatus {
    @JsonProperty(value = "UNSPECIFIED") UNSPECIFIED,
    @JsonProperty(value = "VALID") VALID,
    @JsonProperty(value = "INVALID") INVALID,
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "DELETED") DELETED,
    @JsonProperty(value = "SECONDARY") SECONDARY,
    @JsonProperty(value = "PENDING_SECONDARY") PENDING_SECONDARY,
}
