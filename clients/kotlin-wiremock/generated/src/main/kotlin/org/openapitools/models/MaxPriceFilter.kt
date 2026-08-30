@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MaxPriceFilter(
    @field:JsonProperty("MAX_PRICE")
    val MAX_PRICE: CatalogsProductGroupPricingCriteria,

)
