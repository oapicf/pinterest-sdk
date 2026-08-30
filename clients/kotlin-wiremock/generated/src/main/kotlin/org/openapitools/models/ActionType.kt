@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ActionType {
    @JsonProperty(value = "CLICKTHROUGH") CLICKTHROUGH,
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "VIDEO_V_50_MRC") VIDEO_V_50_MRC,
}
