package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsListProductsByFeedBasedFilter
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsProductGroupFilters
import org.openapitools.server.api.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsListProductsByFilterRequest(
    /** Catalog Feed id pertaining to the catalog product group filter. */
    val feedId: kotlin.String,
    val filters: CatalogsProductGroupFilters
)
