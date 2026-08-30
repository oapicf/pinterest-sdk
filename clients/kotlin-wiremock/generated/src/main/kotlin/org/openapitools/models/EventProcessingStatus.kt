@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class EventProcessingStatus {
    @JsonProperty(value = "failed") failed,
    @JsonProperty(value = "processed") processed,
}
