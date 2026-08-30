@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class NullablePartnerType {
    @JsonProperty(value = "INTERNAL") INTERNAL,
    @JsonProperty(value = "EXTERNAL") EXTERNAL,
}
