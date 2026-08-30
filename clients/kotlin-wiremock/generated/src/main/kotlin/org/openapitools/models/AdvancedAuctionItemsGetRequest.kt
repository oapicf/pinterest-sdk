@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionItemsGetRequest(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<AdvancedAuctionKey>,

)
