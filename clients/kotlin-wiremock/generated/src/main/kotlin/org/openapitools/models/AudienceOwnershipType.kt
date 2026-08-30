@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceOwnershipType {
    @JsonProperty(value = "OWNED") OWNED,
    @JsonProperty(value = "RECEIVED") RECEIVED,
}
