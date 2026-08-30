package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CartingRetailer(
    /** Unique identifier for the retailer */
    val retailerId: kotlin.String,
    /** Name of the retailer */
    val retailerName: kotlin.String
)
