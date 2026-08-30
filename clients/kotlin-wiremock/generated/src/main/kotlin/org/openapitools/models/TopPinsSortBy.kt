@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TopPinsSortBy {
    @JsonProperty(value = "ENGAGEMENT") ENGAGEMENT,
    @JsonProperty(value = "SAVE") SAVE,
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
    @JsonProperty(value = "PIN_CLICK") PIN_CLICK,
}
