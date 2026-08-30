@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class NullableEntityStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
    @JsonProperty(value = "DRAFT") DRAFT,
    @JsonProperty(value = "DELETED_DRAFT") DELETED_DRAFT,
}
