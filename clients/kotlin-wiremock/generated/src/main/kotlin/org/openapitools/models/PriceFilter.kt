@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceFilter(
    @field:JsonProperty("PRICE")
    val PRICE: PriceFilterPrice,

)
