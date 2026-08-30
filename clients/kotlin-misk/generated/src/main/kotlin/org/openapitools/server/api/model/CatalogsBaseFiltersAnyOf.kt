package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsBaseFilterKeys
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsBaseFiltersAnyOf(
    val anyOf: kotlin.collections.List<CatalogsBaseFilterKeys>
)
