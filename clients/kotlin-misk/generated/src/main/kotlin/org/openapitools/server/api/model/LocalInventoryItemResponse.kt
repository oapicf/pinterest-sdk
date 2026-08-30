package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemAvailability
import org.openapitools.server.api.model.StoreMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryItemResponse(
    /** The millisecond timestamp when the local inventory item was created */
    val createdAt: kotlin.Long,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    /** The millisecond timestamp when the local inventory item was lastly modified by the merchant. */
    val lastUpdatedTime: kotlin.Long,
    /** Store metadata for this local inventory item */
    val storeMetadata: StoreMetadata,
    /** Ad link for the item */
    val adLink: kotlin.String? = null,
    /** Availability status of the item */
    val availability: ItemAvailability? = null,
    /** The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. */
    val price: kotlin.String? = null,
    /** The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. */
    val salePrice: kotlin.String? = null
)
