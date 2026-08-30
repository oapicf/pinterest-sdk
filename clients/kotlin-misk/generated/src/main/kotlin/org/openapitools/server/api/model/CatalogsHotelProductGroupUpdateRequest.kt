package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductGroupFilters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupUpdateRequest(
    val catalogType: kotlin.String? = null,
    val description: kotlin.String? = null,
    val filters: CatalogsHotelProductGroupFilters? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null
)
