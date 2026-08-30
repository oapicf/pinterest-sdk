package org.openapitools.server.api.model

import org.openapitools.server.api.model.FilterOperatorType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupFilterOperatorTypeCriteria(
    val propertyValues: kotlin.collections.List<kotlin.String>,
    val filterOperatorType: FilterOperatorType? = null,
    val negated: kotlin.Boolean? = null
)
