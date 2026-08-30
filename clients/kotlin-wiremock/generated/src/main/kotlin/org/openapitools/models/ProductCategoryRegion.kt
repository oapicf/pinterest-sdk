@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductCategoryRegion {
    @JsonProperty(value = "US") US,
    @JsonProperty(value = "GB+IE") GBPlusIE,
    @JsonProperty(value = "CA") CA,
}
