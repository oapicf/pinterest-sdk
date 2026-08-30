@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsProductGroupProductCounts(
    @field:JsonProperty("app_links")
    val appLinks: java.math.BigDecimal,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("images")
    val images: java.math.BigDecimal,

    @field:JsonProperty("total")
    val total: java.math.BigDecimal,

    @field:JsonProperty("videos")
    val videos: java.math.BigDecimal,

)
