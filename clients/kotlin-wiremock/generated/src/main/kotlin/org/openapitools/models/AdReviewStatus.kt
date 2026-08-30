@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdReviewStatus {
    @JsonProperty(value = "OTHER") OTHER,
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "REJECTED") REJECTED,
    @JsonProperty(value = "APPROVED") APPROVED,
}
