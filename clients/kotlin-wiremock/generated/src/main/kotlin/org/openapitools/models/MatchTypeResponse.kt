@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MatchTypeResponse {
    @JsonProperty(value = "BROAD") BROAD,
    @JsonProperty(value = "PHRASE") PHRASE,
    @JsonProperty(value = "EXACT") EXACT,
    @JsonProperty(value = "EXACT_NEGATIVE") EXACT_NEGATIVE,
    @JsonProperty(value = "PHRASE_NEGATIVE") PHRASE_NEGATIVE,
}
