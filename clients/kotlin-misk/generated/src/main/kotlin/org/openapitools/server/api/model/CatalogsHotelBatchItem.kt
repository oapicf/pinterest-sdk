package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreateHotelItem
import org.openapitools.server.api.model.CatalogsDeleteHotelItem
import org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes
import org.openapitools.server.api.model.CatalogsUpdateHotelItem
import org.openapitools.server.api.model.CatalogsUpsertHotelItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelBatchItem(
    val attributes: CatalogsUpdatableHotelAttributes,
    /** The catalog hotel id in the merchant namespace */
    val hotelId: kotlin.String,
    val operation: kotlin.String
)
