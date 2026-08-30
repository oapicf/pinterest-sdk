@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AssetGroupType {
    @JsonProperty(value = "BRAND") BRAND,
    @JsonProperty(value = "LOCATION_OR_LANGUAGE") LOCATION_OR_LANGUAGE,
    @JsonProperty(value = "PRODUCT_LINE") PRODUCT_LINE,
    @JsonProperty(value = "OTHER") OTHER,
}
