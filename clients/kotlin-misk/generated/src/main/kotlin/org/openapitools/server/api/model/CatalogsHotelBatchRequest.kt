package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelBatchItem
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelBatchRequest(
    val catalogType: kotlin.String,
    val country: Country,
    /** Array with catalogs item operations */
    val items: kotlin.collections.List<CatalogsHotelBatchItem>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    /** Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    val catalogId: kotlin.String? = null
)
