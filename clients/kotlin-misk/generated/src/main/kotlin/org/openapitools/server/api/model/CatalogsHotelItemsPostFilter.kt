package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelItemsPostFilter(
    val catalogType: kotlin.String,
    val hotelIds: kotlin.collections.List<kotlin.String>,
    /** Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    val catalogId: kotlin.String? = null
)
