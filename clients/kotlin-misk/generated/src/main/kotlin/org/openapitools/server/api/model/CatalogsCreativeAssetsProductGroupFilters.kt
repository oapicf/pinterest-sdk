package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilterKeys
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAllOf
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductGroupFilters(
    val anyOf: kotlin.collections.List<CatalogsCreativeAssetsProductGroupFilterKeys>,
    val allOf: kotlin.collections.List<CatalogsCreativeAssetsProductGroupFilterKeys>
)
