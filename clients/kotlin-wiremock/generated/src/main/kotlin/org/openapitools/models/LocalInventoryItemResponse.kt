@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalInventoryItemResponse(
    @field:JsonProperty("created_at")
    val createdAt: kotlin.Long,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("last_updated_time")
    val lastUpdatedTime: kotlin.Long,

    @field:JsonProperty("store_metadata")
    val storeMetadata: StoreMetadata,

    @field:JsonProperty("ad_link")
    val adLink: kotlin.String? = null,

    @field:JsonProperty("availability")
    val availability: ItemAvailability? = null,

    @field:JsonProperty("price")
    val price: kotlin.String? = null,

    @field:JsonProperty("sale_price")
    val salePrice: kotlin.String? = null,

)
