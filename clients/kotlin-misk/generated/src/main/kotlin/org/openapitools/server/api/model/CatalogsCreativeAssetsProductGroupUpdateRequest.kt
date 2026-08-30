package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductGroupUpdateRequest(
    val catalogType: kotlin.String? = null,
    val description: kotlin.String? = null,
    val filters: CatalogsCreativeAssetsProductGroupFilters? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null
)
