@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CatalogsStatus {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "INACTIVE") INACTIVE,
}
