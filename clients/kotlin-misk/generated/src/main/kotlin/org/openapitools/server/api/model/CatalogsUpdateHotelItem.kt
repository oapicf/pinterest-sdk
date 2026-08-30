package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsUpdateHotelItem(
    val attributes: CatalogsUpdatableHotelAttributes,
    /** The catalog hotel item id in the merchant namespace */
    val hotelId: kotlin.String,
    val operation: kotlin.String
)
