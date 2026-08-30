@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PartnerType {
    @JsonProperty(value = "INTERNAL") INTERNAL,
    @JsonProperty(value = "EXTERNAL") EXTERNAL,
}
