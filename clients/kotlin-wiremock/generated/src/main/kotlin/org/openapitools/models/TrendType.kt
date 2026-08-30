@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TrendType {
    @JsonProperty(value = "growing") growing,
    @JsonProperty(value = "monthly") monthly,
    @JsonProperty(value = "yearly") yearly,
    @JsonProperty(value = "seasonal") seasonal,
}
