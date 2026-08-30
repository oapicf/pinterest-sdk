package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsAvailableFilterValues
import org.openapitools.server.api.model.CatalogsCreativeAssetsFilterValuesMap
import org.openapitools.server.api.model.CatalogsHotelAvailableFilterValues
import org.openapitools.server.api.model.CatalogsRetailAvailableFilterValues
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsAvailableFilterValues(
    val catalogType: kotlin.String,
    val filterValues: CatalogsCreativeAssetsFilterValuesMap
)
