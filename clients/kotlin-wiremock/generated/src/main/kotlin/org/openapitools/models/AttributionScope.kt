@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AttributionScope {
    @JsonProperty(value = "view") view,
    @JsonProperty(value = "engagement") engagement,
    @JsonProperty(value = "click") click,
}
