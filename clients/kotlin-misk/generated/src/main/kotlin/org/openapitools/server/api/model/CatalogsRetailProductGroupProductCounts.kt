package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProductGroupProductCounts(
    val catalogType: kotlin.String,
    val inStock: java.math.BigDecimal,
    val outOfStock: java.math.BigDecimal,
    val preorder: java.math.BigDecimal,
    val total: java.math.BigDecimal,
    val videos: java.math.BigDecimal? = null
)
