package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemAvailability
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RetailLocalInventoryItemAttributes(
    /** Availability status of the item */
    val availability: ItemAvailability,
    /** The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. */
    val price: kotlin.String,
    /** Ad link for the item */
    val adLink: kotlin.String? = null,
    /** The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. */
    val salePrice: kotlin.String? = null
)
