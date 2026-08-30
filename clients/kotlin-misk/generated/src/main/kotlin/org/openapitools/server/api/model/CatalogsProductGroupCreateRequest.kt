package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupCreateRequest(
    /** Catalog Feed id pertaining to the catalog product group. */
    val feedId: kotlin.String,
    val filters: CatalogsProductGroupFiltersRequest,
    val name: kotlin.String,
    val description: kotlin.String? = null,
    /** boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null
)
