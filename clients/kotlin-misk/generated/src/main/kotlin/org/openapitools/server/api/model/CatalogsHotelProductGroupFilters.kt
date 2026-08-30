package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys
import org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAllOf
import org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAnyOf
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupFilters(
    val anyOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>,
    val allOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>
)
