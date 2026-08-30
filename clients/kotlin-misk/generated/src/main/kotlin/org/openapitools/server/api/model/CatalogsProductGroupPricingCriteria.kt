package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupPricingCriteria(
    val propertyValues: java.math.BigDecimal,
    val inclusion: kotlin.Boolean? = true,
    val negated: kotlin.Boolean? = null
)
