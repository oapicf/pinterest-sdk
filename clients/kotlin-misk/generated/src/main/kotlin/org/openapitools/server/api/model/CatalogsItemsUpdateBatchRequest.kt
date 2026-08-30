package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.ItemUpdateBatchRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsUpdateBatchRequest(
    val country: Country,
    /** Array with catalogs items */
    val items: kotlin.collections.List<ItemUpdateBatchRecord>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    val operation: kotlin.String
)
