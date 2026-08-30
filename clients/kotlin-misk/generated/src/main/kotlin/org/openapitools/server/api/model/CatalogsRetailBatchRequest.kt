package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsRetailBatchRequestItemsItems
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailBatchRequest(
    val catalogType: kotlin.String,
    val country: Country,
    /** Array with catalogs item operations */
    val items: kotlin.collections.List<CatalogsRetailBatchRequestItemsItems>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    /** Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    val catalogId: kotlin.String? = null
)
