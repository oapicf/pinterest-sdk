@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailProductMetadata(
    @field:JsonProperty("availability")
    val availability: ProductAvailability,

    @field:JsonProperty("currency")
    val currency: NonNullableCatalogsCurrency,

    @field:JsonProperty("item_group_id")
    val itemGroupId: kotlin.String,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal,

    @field:JsonProperty("sale_price")
    val salePrice: java.math.BigDecimal,

)
