@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RetailLocalInventoryItemAttributesOptional(
    @field:JsonProperty("ad_link")
    val adLink: kotlin.String? = null,

    @field:JsonProperty("availability")
    val availability: ItemAvailability? = null,

    @field:JsonProperty("price")
    val price: kotlin.String? = null,

    @field:JsonProperty("sale_price")
    val salePrice: kotlin.String? = null,

)
