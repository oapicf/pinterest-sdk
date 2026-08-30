@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignUpdateRequestAllOf2(
    @field:JsonProperty("bid_options")
    val bidOptions: CampaignBidOptionsUpdate? = null,

    @field:JsonProperty("intended_promotion_type")
    val intendedPromotionType: IntendedPromotionType? = null,

    @field:JsonProperty("is_ltv_optimized")
    val isLtvOptimized: kotlin.Boolean? = null,

    @field:JsonProperty("is_performance_plus")
    val isPerformancePlus: kotlin.Boolean? = null,

    @field:JsonProperty("is_top_of_search")
    val isTopOfSearch: kotlin.Boolean? = null,

    @field:JsonProperty("objective_type")
    val objectiveType: ObjectiveType? = null,

)
