package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.server.api.model.CatalogsHotelListProductsByCatalogBasedFilterRequest
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsRetailListProductsByCatalogBasedFilterRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsVerticalsListProductsByCatalogBasedFilterRequest(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val country: Country,
    val filters: CatalogsCreativeAssetsProductGroupFilters,
    val locale: CatalogsLocale
)
