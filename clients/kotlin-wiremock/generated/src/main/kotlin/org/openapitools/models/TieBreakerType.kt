@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TieBreakerType {
    @JsonProperty(value = "RANDOM") RANDOM,
    @JsonProperty(value = "CUSTOM") CUSTOM,
}
