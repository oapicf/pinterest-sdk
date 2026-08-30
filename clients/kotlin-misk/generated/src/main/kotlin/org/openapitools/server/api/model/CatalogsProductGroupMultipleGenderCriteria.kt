package org.openapitools.server.api.model

import org.openapitools.server.api.model.Gender
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupMultipleGenderCriteria(
    val propertyValues: kotlin.collections.List<Gender>,
    val negated: kotlin.Boolean? = null
)
