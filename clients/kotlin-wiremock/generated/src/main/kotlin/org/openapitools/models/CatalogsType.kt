@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CatalogsType {
    @JsonProperty(value = "RETAIL") RETAIL,
    @JsonProperty(value = "HOTEL") HOTEL,
    @JsonProperty(value = "CREATIVE_ASSETS") CREATIVE_ASSETS,
}
