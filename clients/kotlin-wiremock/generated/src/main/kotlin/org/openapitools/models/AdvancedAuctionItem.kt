@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionItem(
    @field:JsonProperty("bid_options")
    val bidOptions: AdvancedAuctionBidOptions,

    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("language")
    val language: Language,

)
