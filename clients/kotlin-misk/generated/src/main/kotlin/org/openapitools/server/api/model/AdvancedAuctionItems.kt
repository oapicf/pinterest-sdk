package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvancedAuctionItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionItems(
    /** Response object of item bid options */
    val catalogId: kotlin.String? = null,
    /** Array with item bid options */
    val items: kotlin.collections.List<AdvancedAuctionItem>? = null
)
