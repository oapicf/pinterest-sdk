@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionProcessedItems(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<AdvancedAuctionItemsSubmitRecord>? = null,

)
