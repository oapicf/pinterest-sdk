@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CartingProduct(
    @field:JsonProperty("carting_product_id")
    val cartingProductId: kotlin.String,

    @field:JsonProperty("display_preferred_retailers_only")
    val displayPreferredRetailersOnly: kotlin.Boolean? = null,

    @field:JsonProperty("display_product_price")
    val displayProductPrice: kotlin.Boolean? = null,

    @field:JsonProperty("preferred_retailers")
    val preferredRetailers: kotlin.collections.List<CartingRetailer>? = null,

    @field:JsonProperty("randomize_preferred_retailers")
    val randomizePreferredRetailers: kotlin.Boolean? = null,

)
