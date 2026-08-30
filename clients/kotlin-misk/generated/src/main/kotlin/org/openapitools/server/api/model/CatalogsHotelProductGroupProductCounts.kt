package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupProductCounts(
    val catalogType: kotlin.String,
    val total: java.math.BigDecimal
)
