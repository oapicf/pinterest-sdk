package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupUpdateRequest
import org.openapitools.server.api.model.CatalogsHotelProductGroupUpdateRequest
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsRetailProductGroupUpdateRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsVerticalProductGroupUpdateRequest(
    val catalogType: kotlin.String? = null,
    val country: Country? = null,
    val description: kotlin.String? = null,
    val filters: CatalogsCreativeAssetsProductGroupFilters? = null,
    val locale: CatalogsLocale? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null
)
