@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventsDataItemsCustomDataContentsItems(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("item_brand")
    val itemBrand: kotlin.String? = null,

    @field:JsonProperty("item_brand_id")
    val itemBrandId: kotlin.String? = null,

    @field:JsonProperty("item_category")
    val itemCategory: kotlin.String? = null,

    @field:JsonProperty("item_name")
    val itemName: kotlin.String? = null,

    @field:JsonProperty("item_price")
    val itemPrice: kotlin.String? = null,

    @field:JsonProperty("quantity")
    val quantity: kotlin.Long? = null,

)
