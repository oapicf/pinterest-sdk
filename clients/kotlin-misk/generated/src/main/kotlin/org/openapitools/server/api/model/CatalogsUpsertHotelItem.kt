package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelAttributes
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsUpsertHotelItem(
    val attributes: CatalogsHotelAttributes,
    /** The catalog hotel id in the merchant namespace */
    val hotelId: kotlin.String,
    val operation: kotlin.String
)
