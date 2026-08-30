package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupProductCounts
import org.openapitools.server.api.model.CatalogsHotelProductGroupProductCounts
import org.openapitools.server.api.model.CatalogsRetailProductGroupProductCounts
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupProductCountsVertical(
    val catalogType: kotlin.String,
    val inStock: java.math.BigDecimal,
    val outOfStock: java.math.BigDecimal,
    val preorder: java.math.BigDecimal,
    val total: java.math.BigDecimal,
    val videos: java.math.BigDecimal,
    val appLinks: java.math.BigDecimal,
    val images: java.math.BigDecimal
)
