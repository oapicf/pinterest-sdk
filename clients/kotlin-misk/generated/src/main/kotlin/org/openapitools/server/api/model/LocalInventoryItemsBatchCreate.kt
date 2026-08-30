package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocalInventoryOperation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryItemsBatchCreate(
    /** Array of inventory operations. Up to 1000 items per request. */
    val operations: kotlin.collections.List<LocalInventoryOperation>
)
