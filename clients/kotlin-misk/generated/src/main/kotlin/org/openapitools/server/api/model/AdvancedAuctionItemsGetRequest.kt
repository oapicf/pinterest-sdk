package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvancedAuctionKey
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionItemsGetRequest(
    /** Catalog id pertaining to the retail item */
    val catalogId: kotlin.String,
    /** A list of retail catalog items to fetch bid options for */
    val items: kotlin.collections.List<AdvancedAuctionKey>
)
