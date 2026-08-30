@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductCategoryDetailLookbackWindow {
    @JsonProperty(value = "90") _90,
    @JsonProperty(value = "180") _180,
    @JsonProperty(value = "365") _365,
    @JsonProperty(value = "730") _730,
}
