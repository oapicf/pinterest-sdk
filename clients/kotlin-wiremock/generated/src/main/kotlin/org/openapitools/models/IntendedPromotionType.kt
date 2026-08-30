@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class IntendedPromotionType {
    @JsonProperty(value = "LEGACY") LEGACY,
    @JsonProperty(value = "STANDARD_AD") STANDARD_AD,
    @JsonProperty(value = "CATALOG") CATALOG,
}
