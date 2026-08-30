@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OptimizationType {
    @JsonProperty(value = "CLICKTHROUGH") CLICKTHROUGH,
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "WEB_CONVERSION") WEB_CONVERSION,
    @JsonProperty(value = "ROAS") ROAS,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
}
