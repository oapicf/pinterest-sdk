package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionProcessedItems(
    /** Catalog id pertaining to all items */
    val catalogId: kotlin.String? = null,
    /** Array of advanced auction processed items */
    val items: kotlin.collections.List<AdvancedAuctionItemsSubmitRecord>? = null
)
