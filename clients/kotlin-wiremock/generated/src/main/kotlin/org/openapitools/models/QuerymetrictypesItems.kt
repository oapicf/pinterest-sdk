@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class QuerymetrictypesItems {
    @JsonProperty(value = "ENGAGEMENT") ENGAGEMENT,
    @JsonProperty(value = "ENGAGEMENT_RATE") ENGAGEMENT_RATE,
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
    @JsonProperty(value = "OUTBOUND_CLICK_RATE") OUTBOUND_CLICK_RATE,
    @JsonProperty(value = "PIN_CLICK") PIN_CLICK,
    @JsonProperty(value = "PIN_CLICK_RATE") PIN_CLICK_RATE,
    @JsonProperty(value = "SAVE") SAVE,
    @JsonProperty(value = "SAVE_RATE") SAVE_RATE,
}
