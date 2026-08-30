@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionItemsSubmitRecord(
    @field:JsonProperty("bid_options")
    val bidOptions: AdvancedAuctionBidOptions,

    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("language")
    val language: Language,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("update_mask")
    val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null,

)
