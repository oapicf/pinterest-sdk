package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupsList200Response(
    val items: kotlin.collections.List<CatalogsVerticalProductGroup>,
    val bookmark: kotlin.String? = null
)
