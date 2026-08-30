@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class StandardPinMetricTypes {
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
    @JsonProperty(value = "PIN_CLICK") PIN_CLICK,
    @JsonProperty(value = "SAVE") SAVE,
    @JsonProperty(value = "SAVE_RATE") SAVE_RATE,
    @JsonProperty(value = "TOTAL_COMMENTS") TOTAL_COMMENTS,
    @JsonProperty(value = "TOTAL_REACTIONS") TOTAL_REACTIONS,
    @JsonProperty(value = "USER_FOLLOW") USER_FOLLOW,
    @JsonProperty(value = "PROFILE_VISIT") PROFILE_VISIT,
}
