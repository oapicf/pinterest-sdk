package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsProductGroupCreateRequest
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import org.openapitools.server.api.model.CatalogsVerticalProductGroupCreateRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkUpsertRequestCreateCatalogProductGroupsItems(
    /** Catalog Feed id pertaining to the catalog product group. */
    val feedId: kotlin.String,
    val filters: CatalogsProductGroupFiltersRequest,
    val name: kotlin.String,
    val description: kotlin.String? = null,
    /** boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null
)
