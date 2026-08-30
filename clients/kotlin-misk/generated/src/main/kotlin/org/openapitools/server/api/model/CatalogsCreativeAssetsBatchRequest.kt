package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsBatchItem
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsBatchRequest(
    val catalogType: kotlin.String,
    val country: Country,
    /** Array with creative assets item operations */
    val items: kotlin.collections.List<CatalogsCreativeAssetsBatchItem>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    /** Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    val catalogId: kotlin.String? = null
)
