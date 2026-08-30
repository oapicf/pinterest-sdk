@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupProductCountsVertical(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("in_stock")
    val inStock: java.math.BigDecimal,

    @field:JsonProperty("out_of_stock")
    val outOfStock: java.math.BigDecimal,

    @field:JsonProperty("preorder")
    val preorder: java.math.BigDecimal,

    @field:JsonProperty("total")
    val total: java.math.BigDecimal,

    @field:JsonProperty("videos")
    val videos: java.math.BigDecimal,

    @field:JsonProperty("app_links")
    val appLinks: java.math.BigDecimal,

    @field:JsonProperty("images")
    val images: java.math.BigDecimal,

)
