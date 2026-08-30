package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemsCreateBatchRequest
import org.openapitools.server.api.model.CatalogsItemsDeleteBatchRequest
import org.openapitools.server.api.model.CatalogsItemsDeleteDiscontinuedBatchRequest
import org.openapitools.server.api.model.CatalogsItemsUpdateBatchRequest
import org.openapitools.server.api.model.CatalogsItemsUpsertBatchRequest
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.ItemDeleteBatchRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsBatchRequest(
    val country: Country,
    /** Array with catalogs items */
    val items: kotlin.collections.List<ItemDeleteBatchRecord>,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String,
    val operation: kotlin.String
)
