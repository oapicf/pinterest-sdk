package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsDeleteHotelItem(
    /** The catalog hotel id in the merchant namespace */
    val hotelId: kotlin.String,
    val operation: kotlin.String
)
