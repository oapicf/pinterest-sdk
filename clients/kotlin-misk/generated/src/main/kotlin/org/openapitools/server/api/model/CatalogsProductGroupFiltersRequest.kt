package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilterKeys
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems0
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems1
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupFiltersRequest(
    val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>,
    val allOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>
)
