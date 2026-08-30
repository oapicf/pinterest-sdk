package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsRetailFilterValuesMap
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailAvailableFilterValues(
    val catalogType: kotlin.String,
    val filterValues: CatalogsRetailFilterValuesMap
)
