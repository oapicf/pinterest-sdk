package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val filters: CatalogsCreativeAssetsProductGroupFilters
)
