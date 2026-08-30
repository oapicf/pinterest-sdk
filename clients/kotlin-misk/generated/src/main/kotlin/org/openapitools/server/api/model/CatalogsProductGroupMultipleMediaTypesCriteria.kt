package org.openapitools.server.api.model

import org.openapitools.server.api.model.MediaType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupMultipleMediaTypesCriteria(
    val propertyValues: kotlin.collections.List<MediaType>,
    val negated: kotlin.Boolean? = null
)
