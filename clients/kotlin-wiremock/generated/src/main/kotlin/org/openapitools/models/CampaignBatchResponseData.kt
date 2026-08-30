@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignBatchResponseData(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("bid_options")
    val bidOptions: CampaignBidOptions? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("daily_spend_cap")
    val dailySpendCap: kotlin.Int? = null,

    @field:JsonProperty("default_ad_group_budget_in_micro_currency")
    val defaultAdGroupBudgetInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("intended_promotion_type")
    val intendedPromotionType: IntendedPromotionType? = null,

    @field:JsonProperty("is_automated_campaign")
    val isAutomatedCampaign: kotlin.Boolean? = null,

    @field:JsonProperty("is_campaign_budget_optimization")
    val isCampaignBudgetOptimization: kotlin.Boolean? = null,

    @field:JsonProperty("is_carting")
    val isCarting: kotlin.Boolean? = null,

    @field:JsonProperty("is_flexible_daily_budgets")
    val isFlexibleDailyBudgets: kotlin.Boolean? = null,

    @field:JsonProperty("is_ltv_optimized")
    val isLtvOptimized: kotlin.Boolean? = null,

    @field:JsonProperty("is_performance_plus")
    val isPerformancePlus: kotlin.Boolean? = null,

    @field:JsonProperty("is_top_of_search")
    val isTopOfSearch: kotlin.Boolean? = null,

    @field:JsonProperty("lifetime_spend_cap")
    val lifetimeSpendCap: kotlin.Int? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("objective_type")
    val objectiveType: CampaignObjectiveType? = null,

    @field:JsonProperty("order_line_id")
    val orderLineId: kotlin.String? = null,

    @field:JsonProperty("performance_plus_campaign_settings")
    val performancePlusCampaignSettings: PerformancePlusCampaignSettings? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: NullableEntityStatus? = null,

    @field:JsonProperty("summary_status")
    val summaryStatus: SummaryStatus? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int? = null,

)
