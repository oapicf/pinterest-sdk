package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductMetadata(
    /** The user-created unique ID that represents the hotel item. */
    val hotelId: kotlin.String
)
