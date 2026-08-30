package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilterKeys
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductGroupFiltersAllOf(
    val allOf: kotlin.collections.List<CatalogsCreativeAssetsProductGroupFilterKeys>
)
