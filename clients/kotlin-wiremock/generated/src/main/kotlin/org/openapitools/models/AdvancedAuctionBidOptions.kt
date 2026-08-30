@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionBidOptions(
    @field:JsonProperty("app_type_multipliers")
    val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:JsonProperty("bid_in_micro_currency")
    val bidInMicroCurrency: kotlin.Long? = null,

    @field:JsonProperty("placement_multipliers")
    val placementMultipliers: PlacementMultipliers? = null,

)
