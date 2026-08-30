package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroup
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.server.api.model.CatalogsHotelProductGroup
import org.openapitools.server.api.model.CatalogsHotelProductGroupType
import org.openapitools.server.api.model.CatalogsProductGroupStatus
import org.openapitools.server.api.model.CatalogsRetailProductGroup
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsVerticalProductGroup(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    /** id of the catalogs feed belonging to this catalog product group */
    val feedId: kotlin.String,
    val filters: CatalogsCreativeAssetsProductGroupFilters,
    /** ID of the catalog product group. */
    val id: kotlin.String,
    val type: CatalogsHotelProductGroupType,
    val country: kotlin.String? = null,
    /** Unix timestamp in seconds of when catalog product group was created. */
    val createdAt: kotlin.Int? = null,
    val description: kotlin.String? = null,
    /** boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null,
    val locale: kotlin.String? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null,
    val status: CatalogsProductGroupStatus? = null,
    /** Unix timestamp in seconds of last time catalog product group was updated. */
    val updatedAt: kotlin.Int? = null
)
