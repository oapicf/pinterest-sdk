package org.openapitools.server.api.model

import org.openapitools.server.api.model.RetailLocalInventoryItemAttributesOptional
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryUpdateOperation(
    val attributes: RetailLocalInventoryItemAttributesOptional,
    /** Catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    val operation: kotlin.String,
    /** Store code for the local inventory item */
    val storeCode: kotlin.String
)
