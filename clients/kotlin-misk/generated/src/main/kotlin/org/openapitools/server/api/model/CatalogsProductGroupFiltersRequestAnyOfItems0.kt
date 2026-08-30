package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilterKeys
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupFiltersRequestAnyOfItems0(
    val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>
)
