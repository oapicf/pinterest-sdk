@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TargetingTemplateStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "DELETED") DELETED,
}
