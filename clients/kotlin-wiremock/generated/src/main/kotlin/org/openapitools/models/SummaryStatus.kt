@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class SummaryStatus {
    @JsonProperty(value = "RUNNING") RUNNING,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "NOT_STARTED") NOT_STARTED,
    @JsonProperty(value = "COMPLETED") COMPLETED,
    @JsonProperty(value = "ADVERTISER_DISABLED") ADVERTISER_DISABLED,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
    @JsonProperty(value = "DRAFT") DRAFT,
    @JsonProperty(value = "DELETED_DRAFT") DELETED_DRAFT,
}
