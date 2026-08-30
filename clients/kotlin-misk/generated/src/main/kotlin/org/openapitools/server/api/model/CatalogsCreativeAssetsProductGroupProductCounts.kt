package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductGroupProductCounts(
    val appLinks: java.math.BigDecimal,
    val catalogType: kotlin.String,
    val images: java.math.BigDecimal,
    val total: java.math.BigDecimal,
    val videos: java.math.BigDecimal
)
