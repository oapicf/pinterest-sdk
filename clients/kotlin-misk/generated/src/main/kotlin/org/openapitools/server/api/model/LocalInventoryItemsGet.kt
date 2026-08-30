package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocalInventoryItemResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryItemsGet(
    /** Array of local inventory items */
    val items: kotlin.collections.List<LocalInventoryItemResponse>
)
