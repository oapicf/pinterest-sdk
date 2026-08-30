package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductGroupFilters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupCreateRequest(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val filters: CatalogsHotelProductGroupFilters,
    val name: kotlin.String,
    val description: kotlin.String? = null
)
