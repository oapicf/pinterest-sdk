package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest
import org.openapitools.server.api.model.CatalogsVerticalProductGroupUpdateRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupsUpdateRequestSchema(
    val description: kotlin.String? = null,
    val filters: CatalogsProductGroupFiltersRequest? = null,
    /** boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null,
    val name: kotlin.String? = null
)
