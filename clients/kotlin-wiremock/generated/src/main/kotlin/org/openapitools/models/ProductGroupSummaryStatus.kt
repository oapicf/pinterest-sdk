@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductGroupSummaryStatus {
    @JsonProperty(value = "RUNNING") RUNNING,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "EXCLUDED") EXCLUDED,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
}
