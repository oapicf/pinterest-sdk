package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelFilterValuesMap
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelAvailableFilterValues(
    val catalogType: kotlin.String,
    val filterValues: CatalogsHotelFilterValuesMap
)
