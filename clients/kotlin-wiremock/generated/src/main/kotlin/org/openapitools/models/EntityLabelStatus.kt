@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class EntityLabelStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
    @JsonProperty(value = "NULL") NULL,
}
