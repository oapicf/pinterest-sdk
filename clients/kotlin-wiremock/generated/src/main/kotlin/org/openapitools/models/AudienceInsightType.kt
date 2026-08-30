@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceInsightType {
    @JsonProperty(value = "YOUR_TOTAL_AUDIENCE") YOUR_TOTAL_AUDIENCE,
    @JsonProperty(value = "YOUR_ENGAGED_AUDIENCE") YOUR_ENGAGED_AUDIENCE,
    @JsonProperty(value = "PINTEREST_TOTAL_AUDIENCE") PINTEREST_TOTAL_AUDIENCE,
}
