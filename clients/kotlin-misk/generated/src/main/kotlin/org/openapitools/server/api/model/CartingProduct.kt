package org.openapitools.server.api.model

import org.openapitools.server.api.model.CartingRetailer
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CartingProduct(
    /** the internal Pinterest carting product id (different from industry product id) */
    val cartingProductId: kotlin.String,
    /** Whether to display only the preferred retailers for the carting product */
    val displayPreferredRetailersOnly: kotlin.Boolean? = null,
    /** Whether to display the price for the carting product */
    val displayProductPrice: kotlin.Boolean? = null,
    /** A sorted array of preferred retailers for the carting product */
    val preferredRetailers: kotlin.collections.List<CartingRetailer>? = null,
    /** Whether to randomize preferred retailers for the carting product */
    val randomizePreferredRetailers: kotlin.Boolean? = null
)
