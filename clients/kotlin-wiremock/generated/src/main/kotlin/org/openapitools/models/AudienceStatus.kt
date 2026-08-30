@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceStatus {
    @JsonProperty(value = "INITIALIZING") INITIALIZING,
    @JsonProperty(value = "READY") READY,
    @JsonProperty(value = "TOO_SMALL") TOO_SMALL,
    @JsonProperty(value = "ELIGIBLE") ELIGIBLE,
    @JsonProperty(value = "PERSONAS_INELIGIBLE_SIZE") PERSONAS_INELIGIBLE_SIZE,
    @JsonProperty(value = "PERSONAS_INITIALIZING") PERSONAS_INITIALIZING,
}
