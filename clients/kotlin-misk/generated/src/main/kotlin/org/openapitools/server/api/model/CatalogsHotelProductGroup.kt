package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductGroupFilters
import org.openapitools.server.api.model.CatalogsHotelProductGroupType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroup(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val filters: CatalogsHotelProductGroupFilters,
    /** ID of the catalog product group. */
    val id: kotlin.String,
    val type: CatalogsHotelProductGroupType,
    /** Unix timestamp in seconds of when catalog product group was created. */
    val createdAt: kotlin.Int? = null,
    val description: kotlin.String? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null,
    /** Unix timestamp in seconds of last time catalog product group was updated. */
    val updatedAt: kotlin.Int? = null
)
