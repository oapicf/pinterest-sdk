package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.ItemCreateBatchRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsCreateBatchRequest(
    val country: Country,
    /** Array with catalogs items */
    val items: kotlin.collections.List<ItemCreateBatchRecord>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    val operation: kotlin.String
)
