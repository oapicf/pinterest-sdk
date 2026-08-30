@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupUpdateRequest(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("bid_multiplier")
    val bidMultiplier: java.math.BigDecimal? = null,

    @field:JsonProperty("targeting_spec_operations")
    val targetingSpecOperations: kotlin.collections.List<TargetingSpecOperations>? = null,

    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:JsonProperty("bid_in_micro_currency")
    val bidInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("bid_strategy_type")
    val bidStrategyType: BidStrategyType? = null,

    @field:JsonProperty("billable_event")
    val billableEvent: ActionType? = null,

    @field:JsonProperty("budget_in_micro_currency")
    val budgetInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("budget_type")
    val budgetType: BudgetType? = null,

    @field:JsonProperty("campaign_id")
    val campaignId: kotlin.String? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int? = null,

    @field:JsonProperty("is_creative_optimization")
    val isCreativeOptimization: kotlin.Boolean? = null,

    @field:JsonProperty("lifetime_frequency_cap")
    val lifetimeFrequencyCap: kotlin.Int? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("optimization_goal_metadata")
    val optimizationGoalMetadata: kotlin.Any? = null,

    @field:JsonProperty("pacing_delivery_type")
    val pacingDeliveryType: PacingDeliveryType? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: PlacementGroupType? = null,

    @field:JsonProperty("promotion_application_level")
    val promotionApplicationLevel: kotlin.String? = null,

    @field:JsonProperty("promotion_id")
    val promotionId: kotlin.String? = "0",

    @field:JsonProperty("promotion_ids")
    val promotionIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("targeting_spec")
    val targetingSpec: TargetingSpec? = null,

    @field:JsonProperty("targeting_template_ids")
    val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: kotlin.Any? = null,

)
