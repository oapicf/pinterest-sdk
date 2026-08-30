package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailItemsPostFilter(
    val catalogType: kotlin.String,
    val itemIds: kotlin.collections.List<kotlin.String>,
    /** Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    val catalogId: kotlin.String? = null
)
