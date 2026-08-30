@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class NonDraftEntityStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
}
