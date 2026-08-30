@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceUpdateOperationType {
    @JsonProperty(value = "UPDATE") UPDATE,
    @JsonProperty(value = "REMOVE") REMOVE,
}
