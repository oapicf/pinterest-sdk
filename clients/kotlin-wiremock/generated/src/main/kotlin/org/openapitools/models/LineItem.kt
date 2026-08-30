@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LineItem(
    @field:JsonProperty("product_brand")
    val productBrand: kotlin.String? = null,

    @field:JsonProperty("product_category")
    val productCategory: kotlin.String? = null,

    @field:JsonProperty("product_id")
    val productId: kotlin.Int? = null,

    @field:JsonProperty("product_name")
    val productName: kotlin.String? = null,

    @field:JsonProperty("product_price")
    val productPrice: kotlin.String? = null,

    @field:JsonProperty("product_quantity")
    val productQuantity: kotlin.Int? = null,

    @field:JsonProperty("product_variant")
    val productVariant: kotlin.String? = null,

    @field:JsonProperty("product_variant_id")
    val productVariantId: kotlin.String? = null,

)
