package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupFiltersAnyOf(
    val anyOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>
)
