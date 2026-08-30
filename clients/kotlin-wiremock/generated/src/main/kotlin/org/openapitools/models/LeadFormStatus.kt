@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LeadFormStatus {
    @JsonProperty(value = "DRAFT") DRAFT,
    @JsonProperty(value = "ACTIVE") ACTIVE,
}
