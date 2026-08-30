@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AttributionModel {
    @JsonProperty(value = "first_touch") first_touch,
    @JsonProperty(value = "last_touch") last_touch,
    @JsonProperty(value = "multi_touch") multi_touch,
    @JsonProperty(value = "mmm") mmm,
}
