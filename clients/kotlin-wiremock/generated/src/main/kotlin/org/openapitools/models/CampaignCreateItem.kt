@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignCreateItem(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("objective_type")
    val objectiveType: ConversionObjectiveType,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("app_id")
    val appId: kotlin.String? = null,

    @field:JsonProperty("app_platform")
    val appPlatform: MobileAppPlatform? = null,

    @field:JsonProperty("bid_options")
    val bidOptions: CampaignBidOptions? = null,

    @field:JsonProperty("daily_spend_cap")
    val dailySpendCap: kotlin.Int? = null,

    @field:JsonProperty("default_ad_group_budget_in_micro_currency")
    val defaultAdGroupBudgetInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int? = null,

    @field:JsonProperty("intended_promotion_type")
    val intendedPromotionType: IntendedPromotionType? = null,

    @field:JsonProperty("is_automated_campaign")
    val isAutomatedCampaign: kotlin.Boolean? = false,

    @field:JsonProperty("is_campaign_budget_optimization")
    val isCampaignBudgetOptimization: kotlin.Boolean? = true,

    @field:JsonProperty("is_flexible_daily_budgets")
    val isFlexibleDailyBudgets: kotlin.Boolean? = false,

    @field:JsonProperty("is_ltv_optimized")
    val isLtvOptimized: kotlin.Boolean? = null,

    @field:JsonProperty("is_performance_plus")
    val isPerformancePlus: kotlin.Boolean? = false,

    @field:JsonProperty("is_top_of_search")
    val isTopOfSearch: kotlin.Boolean? = false,

    @field:JsonProperty("lifetime_spend_cap")
    val lifetimeSpendCap: kotlin.Int? = null,

    @field:JsonProperty("order_line_id")
    val orderLineId: kotlin.String? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: TrackingUrls? = null,

)
