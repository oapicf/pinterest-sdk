package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemsBatchRequest
import org.openapitools.server.api.model.CatalogsVerticalBatchRequest
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.ItemDeleteBatchRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsBatchPostRequest(
    val catalogType: kotlin.String,
    val country: Country,
    /** Array with catalogs items */
    val items: kotlin.collections.List<ItemDeleteBatchRecord>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    val operation: kotlin.String,
    /** Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    val catalogId: kotlin.String? = null
)
