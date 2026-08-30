package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemIdStoreCodePair
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocalInventoryItemsGetCreate(
    /** Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. */
    val itemFilters: kotlin.collections.List<ItemIdStoreCodePair>
)
