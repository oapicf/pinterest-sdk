package org.openapitools.server.api.model

import org.openapitools.server.api.model.RetailLocalInventoryItemAttributes
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryUpsertOperation(
    val attributes: RetailLocalInventoryItemAttributes,
    /** Catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    val operation: kotlin.String,
    /** Store code for the local inventory item */
    val storeCode: kotlin.String
)
