package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenderDemographics
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductCategoriesDemographic(
    /** Age demographic distribution */
    val age: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,
    val gender: GenderDemographics
)
