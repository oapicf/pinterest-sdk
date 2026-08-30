package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilterKeys
import org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf
import org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupFilters(
    val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>,
    val allOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>
)
