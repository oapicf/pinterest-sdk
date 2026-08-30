package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsItemsPostFilter(
    val catalogType: kotlin.String,
    val creativeAssetsIds: kotlin.collections.List<kotlin.String>,
    /** Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    val catalogId: kotlin.String? = null
)
