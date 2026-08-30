@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AttributionMatchType {
    @JsonProperty(value = "P") P,
    @JsonProperty(value = "D") D,
    @JsonProperty(value = "NA") NA,
}
