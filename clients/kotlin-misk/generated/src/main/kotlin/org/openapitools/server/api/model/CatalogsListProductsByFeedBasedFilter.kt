package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsListProductsByFeedBasedFilter(
    /** Catalog Feed id pertaining to the catalog product group filter. */
    val feedId: kotlin.String,
    val filters: CatalogsProductGroupFilters
)
