@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ScheduleStatus {
    @JsonProperty(value = "DRAFT") DRAFT,
    @JsonProperty(value = "CREATED") CREATED,
    @JsonProperty(value = "SCHEDULED") SCHEDULED,
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "COMPLETED") COMPLETED,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "CANCELED") CANCELED,
}
