package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ActionType
import org.openapitools.model.AdGroupTrackingURLs
import org.openapitools.model.AdgroupTrackingFeatures
import org.openapitools.model.BidStrategyType
import org.openapitools.model.BudgetType
import org.openapitools.model.ConversionLearningModeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.NullableOptimizationGoalMetadata
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PerformancePlusCampaignSettings
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.PlacementTrafficType
import org.openapitools.model.PromotionApplicationLevel
import org.openapitools.model.SummaryStatus
import org.openapitools.model.TargetingSpecOptimal
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param billableEvent 
 * @param campaignId Campaign ID of the ad group.
 * @param conversionLearningModeType oCPM learn mode
 * @param createdTime Ad group creation time. Unix timestamp in seconds.
 * @param id Ad group ID.
 * @param name Ad group name.
 * @param summaryStatus 
 * @param type Always \"adgroup\".
 * @param updatedTime Ad group last update time. Unix timestamp in seconds.
 * @param adAccountId Advertiser ID.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param bidStrategyType 
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param customerSegmentId Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
 * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
 * @param extFeatures 
 * @param feedProfileId Feed Profile ID associated to the adgroup.
 * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
 * @param isLocalInventory Indicates whether the ad group should use the local inventory.
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
 * @param localInventoryRadiusInMiles The targeting radius of the local inventory ads in miles.
 * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param performancePlusCampaignSettings Pinterest Performance+ campaign settings.
 * @param placementGroup [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
 * @param placementTrafficType A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
 * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
 * @param promotionId Promotion ID. To clear this field, set to null.
 * @param promotionIds Promotion IDs list. To clear this field, set to an empty array [].
 * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param status Ad group/entity status.
 * @param targetingSpec 
 * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @param trackingUrls 
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
 * @param bidMultiplier [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
 * @param budgetType 
 * @param pacingDeliveryType 
 */
data class AdGroup(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("billable_event")
    @get:JsonProperty("billable_event", required = true) val billableEvent: ActionType,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(required = true, description = "Campaign ID of the ad group.")
    @param:JsonProperty("campaign_id")
    @get:JsonProperty("campaign_id", required = true) val campaignId: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "oCPM learn mode")
    @param:JsonProperty("conversion_learning_mode_type")
    @get:JsonProperty("conversion_learning_mode_type", required = true) val conversionLearningModeType: ConversionLearningModeType?,

    @Schema(required = true, readOnly = true, description = "Ad group creation time. Unix timestamp in seconds.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time", required = true) val createdTime: kotlin.Int,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(required = true, description = "Ad group ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "Ad group name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("summary_status")
    @get:JsonProperty("summary_status", required = true) val summaryStatus: SummaryStatus,

    @Schema(required = true, readOnly = true, description = "Always \"adgroup\".")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: kotlin.String = "adgroup",

    @Schema(required = true, readOnly = true, description = "Ad group last update time. Unix timestamp in seconds.")
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time", required = true) val updatedTime: kotlin.Int,

    @get:Pattern(regexp="^\\d+$")
    @Schema(readOnly = true, description = "Advertiser ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
    @param:JsonProperty("bid_in_micro_currency")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("bid_strategy_type")
    @get:JsonProperty("bid_strategy_type") val bidStrategyType: BidStrategyType? = null,

    @Schema(description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
    @param:JsonProperty("budget_in_micro_currency")
    @get:JsonProperty("budget_in_micro_currency") val budgetInMicroCurrency: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customer_segment_id")
    @get:JsonProperty("customer_segment_id") val customerSegmentId: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.")
    @param:JsonProperty("dca_assets")
    @get:JsonProperty("dca_assets") val dcaAssets: kotlin.Any? = null,

    @Schema(description = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("ext_features")
    @get:JsonProperty("ext_features") val extFeatures: AdgroupTrackingFeatures? = null,

    @Schema(description = "Feed Profile ID associated to the adgroup.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("feed_profile_id")
    @get:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null,

    @Schema(description = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
    @param:JsonProperty("is_creative_optimization")
    @get:JsonProperty("is_creative_optimization") val isCreativeOptimization: kotlin.Boolean? = null,

    @Schema(description = "Indicates whether the ad group should use the local inventory.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_local_inventory")
    @get:JsonProperty("is_local_inventory") val isLocalInventory: kotlin.Boolean? = null,

    @Schema(description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_frequency_cap")
    @get:JsonProperty("lifetime_frequency_cap") val lifetimeFrequencyCap: kotlin.Int? = null,

    @Schema(description = "The targeting radius of the local inventory ads in miles.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("local_inventory_radius_in_miles")
    @get:JsonProperty("local_inventory_radius_in_miles") val localInventoryRadiusInMiles: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
    @param:JsonProperty("optimization_goal_metadata")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: NullableOptimizationGoalMetadata? = null,

    @field:Valid
    @Schema(description = "Pinterest Performance+ campaign settings.")
    @param:JsonProperty("performance_plus_campaign_settings")
    @get:JsonProperty("performance_plus_campaign_settings") val performancePlusCampaignSettings: PerformancePlusCampaignSettings? = null,

    @field:Valid
    @Schema(description = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("placement_group")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = null,

    @field:Valid
    @Schema(description = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both")
    @param:JsonProperty("placement_traffic_type")
    @get:JsonProperty("placement_traffic_type") val placementTrafficType: PlacementTrafficType? = null,

    @field:Valid
    @Schema(example = "ITEM", description = "Specify if the promotion is applied at ad group or item level")
    @param:JsonProperty("promotion_application_level")
    @get:JsonProperty("promotion_application_level") val promotionApplicationLevel: PromotionApplicationLevel? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Promotion ID. To clear this field, set to null.")
    @param:JsonProperty("promotion_id")
    @get:JsonProperty("promotion_id") val promotionId: kotlin.String? = "0",

    @Schema(description = "Promotion IDs list. To clear this field, set to an empty array [].")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_ids")
    @get:JsonProperty("promotion_ids") val promotionIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Ad group/entity status.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_spec")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpecOptimal? = null,

    @get:Size(max=1)
    @Schema(description = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
    @param:JsonProperty("targeting_template_ids")
    @get:JsonProperty("targeting_template_ids") val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: AdGroupTrackingURLs? = null,

    @Schema(description = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="10")
    @Schema(description = "[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).")
    @param:JsonProperty("bid_multiplier")
    @get:JsonProperty("bid_multiplier") val bidMultiplier: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_type")
    @get:JsonProperty("budget_type") val budgetType: BudgetType? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pacing_delivery_type")
    @get:JsonProperty("pacing_delivery_type") val pacingDeliveryType: PacingDeliveryType? = null
) {

}

