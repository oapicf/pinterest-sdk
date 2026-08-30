package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsFilterValuesMap
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsAvailableFilterValues(
    val catalogType: kotlin.String,
    val filterValues: CatalogsCreativeAssetsFilterValuesMap
)
