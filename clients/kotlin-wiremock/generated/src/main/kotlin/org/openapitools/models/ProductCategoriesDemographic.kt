@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductCategoriesDemographic(
    @field:JsonProperty("age")
    val age: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,

    @field:JsonProperty("gender")
    val gender: GenderDemographics,

)
