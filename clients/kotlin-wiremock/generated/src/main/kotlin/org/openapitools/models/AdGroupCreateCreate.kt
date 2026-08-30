@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupCreateCreate(
    @field:JsonProperty("billable_event")
    val billableEvent: ActionType,

    @field:JsonProperty("campaign_id")
    val campaignId: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:JsonProperty("bid_in_micro_currency")
    val bidInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("bid_multiplier")
    val bidMultiplier: java.math.BigDecimal? = null,

    @field:JsonProperty("bid_strategy_type")
    val bidStrategyType: BidStrategyType? = null,

    @field:JsonProperty("budget_in_micro_currency")
    val budgetInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("budget_type")
    val budgetType: BudgetType? = null,

    @field:JsonProperty("customer_segment_id")
    val customerSegmentId: kotlin.String? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int? = null,

    @field:JsonProperty("ext_features")
    val extFeatures: AdgroupTrackingFeatures? = null,

    @field:JsonProperty("feed_profile_id")
    val feedProfileId: kotlin.String? = null,

    @field:JsonProperty("is_creative_optimization")
    val isCreativeOptimization: kotlin.Boolean? = null,

    @field:JsonProperty("is_local_inventory")
    val isLocalInventory: kotlin.Boolean? = null,

    @field:JsonProperty("lifetime_frequency_cap")
    val lifetimeFrequencyCap: kotlin.Int? = null,

    @field:JsonProperty("local_inventory_radius_in_miles")
    val localInventoryRadiusInMiles: java.math.BigDecimal? = null,

    @field:JsonProperty("optimization_goal_metadata")
    val optimizationGoalMetadata: NullableOptimizationGoalMetadata? = null,

    @field:JsonProperty("pacing_delivery_type")
    val pacingDeliveryType: PacingDeliveryType? = null,

    @field:JsonProperty("performance_plus_campaign_settings")
    val performancePlusCampaignSettings: PerformancePlusCampaignSettings? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: PlacementGroupType? = null,

    @field:JsonProperty("placement_traffic_type")
    val placementTrafficType: PlacementTrafficType? = null,

    @field:JsonProperty("promotion_application_level")
    val promotionApplicationLevel: PromotionApplicationLevel? = null,

    @field:JsonProperty("promotion_id")
    val promotionId: kotlin.String? = "0",

    @field:JsonProperty("promotion_ids")
    val promotionIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("targeting_spec")
    val targetingSpec: TargetingSpecOptimal? = null,

    @field:JsonProperty("targeting_template_ids")
    val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: AdGroupTrackingURLs? = null,

)
