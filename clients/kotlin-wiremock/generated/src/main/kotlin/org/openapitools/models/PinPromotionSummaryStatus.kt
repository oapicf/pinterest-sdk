@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PinPromotionSummaryStatus {
    @JsonProperty(value = "APPROVED") APPROVED,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "PENDING") PENDING,
    @JsonProperty(value = "REJECTED") REJECTED,
    @JsonProperty(value = "ADVERTISER_DISABLED") ADVERTISER_DISABLED,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
    @JsonProperty(value = "DRAFT") DRAFT,
    @JsonProperty(value = "DELETED_DRAFT") DELETED_DRAFT,
}
