package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupMultipleCountriesCriteria(
    val propertyValues: kotlin.collections.List<Country>,
    val negated: kotlin.Boolean? = null
)
