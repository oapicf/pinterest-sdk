@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LabelStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "ARCHIVED") ARCHIVED,
}
