@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignCreateRequestAllOf1(
    @field:JsonProperty("objective_type")
    val objectiveType: ObjectiveType,

    @field:JsonProperty("bid_options")
    val bidOptions: CampaignBidOptionsCreate? = null,

    @field:JsonProperty("intended_promotion_type")
    val intendedPromotionType: IntendedPromotionType? = null,

    @field:JsonProperty("is_automated_campaign")
    val isAutomatedCampaign: kotlin.Boolean? = null,

    @field:JsonProperty("is_campaign_budget_optimization")
    val isCampaignBudgetOptimization: kotlin.Boolean? = null,

    @field:JsonProperty("is_flexible_daily_budgets")
    val isFlexibleDailyBudgets: kotlin.Boolean? = null,

    @field:JsonProperty("is_ltv_optimized")
    val isLtvOptimized: kotlin.Boolean? = null,

    @field:JsonProperty("is_performance_plus")
    val isPerformancePlus: kotlin.Boolean? = false,

    @field:JsonProperty("is_top_of_search")
    val isTopOfSearch: kotlin.Boolean? = false,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

)
