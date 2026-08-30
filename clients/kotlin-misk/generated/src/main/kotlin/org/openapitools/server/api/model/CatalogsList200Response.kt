package org.openapitools.server.api.model

import org.openapitools.server.api.model.Catalog
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsList200Response(
    val items: kotlin.collections.List<Catalog>,
    val bookmark: kotlin.String? = null
)
