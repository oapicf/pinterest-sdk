package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupCreateRequest
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.server.api.model.CatalogsHotelProductGroupCreateRequest
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsRetailProductGroupCreateRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsVerticalProductGroupCreateRequest(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val filters: CatalogsCreativeAssetsProductGroupFilters,
    val name: kotlin.String,
    val country: Country? = null,
    val description: kotlin.String? = null,
    val locale: CatalogsLocale? = null
)
