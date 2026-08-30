@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupPricingCriteria(
    @field:JsonProperty("values")
    val propertyValues: java.math.BigDecimal,

    @field:JsonProperty("inclusion")
    val inclusion: kotlin.Boolean? = true,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
