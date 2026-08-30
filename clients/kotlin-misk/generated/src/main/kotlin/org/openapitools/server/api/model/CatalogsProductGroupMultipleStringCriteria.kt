package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupMultipleStringCriteria(
    val propertyValues: kotlin.collections.List<kotlin.String>,
    val negated: kotlin.Boolean? = null
)
