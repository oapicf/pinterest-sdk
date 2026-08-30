package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MinPriceFilter(
    val MIN_PRICE: CatalogsProductGroupPricingCriteria
)
