@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionProductReportBreakdownType {
    @JsonProperty(value = "PRODUCT_BRAND") PRODUCT_BRAND,
    @JsonProperty(value = "PRODUCT_CATEGORY") PRODUCT_CATEGORY,
    @JsonProperty(value = "PRODUCT_BRAND_AND_CATEGORY") PRODUCT_BRAND_AND_CATEGORY,
    @JsonProperty(value = "PRODUCT_SKU") PRODUCT_SKU,
    @JsonProperty(value = "PRODUCT_SKU_GROUP") PRODUCT_SKU_GROUP,
}
