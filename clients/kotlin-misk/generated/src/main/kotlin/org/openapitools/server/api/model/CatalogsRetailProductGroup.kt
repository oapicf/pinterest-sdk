package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilters
import org.openapitools.server.api.model.CatalogsProductGroupStatus
import org.openapitools.server.api.model.CatalogsProductGroupType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProductGroup(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    /** id of the catalogs feed belonging to this catalog product group */
    val feedId: kotlin.String,
    val filters: CatalogsProductGroupFilters,
    /** ID of the catalog product group. */
    val id: kotlin.String,
    val type: CatalogsProductGroupType,
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
