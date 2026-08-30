@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MinPriceFilter(
    @field:JsonProperty("MIN_PRICE")
    val MIN_PRICE: CatalogsProductGroupPricingCriteria,

)
