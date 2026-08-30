package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsItemsPostFilter
import org.openapitools.server.api.model.CatalogsHotelItemsPostFilter
import org.openapitools.server.api.model.CatalogsRetailItemsPostFilter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsPostFilters(
    val catalogType: kotlin.String,
    val itemIds: kotlin.collections.List<kotlin.String>,
    val hotelIds: kotlin.collections.List<kotlin.String>,
    val creativeAssetsIds: kotlin.collections.List<kotlin.String>,
    /** Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    val catalogId: kotlin.String? = null
)
