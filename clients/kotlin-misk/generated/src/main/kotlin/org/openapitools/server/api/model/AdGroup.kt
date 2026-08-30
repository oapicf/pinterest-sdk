package org.openapitools.server.api.model

import org.openapitools.server.api.model.ActionType
import org.openapitools.server.api.model.AdGroupTrackingURLs
import org.openapitools.server.api.model.AdgroupTrackingFeatures
import org.openapitools.server.api.model.BidStrategyType
import org.openapitools.server.api.model.BudgetType
import org.openapitools.server.api.model.ConversionLearningModeType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.NullableOptimizationGoalMetadata
import org.openapitools.server.api.model.PacingDeliveryType
import org.openapitools.server.api.model.PerformancePlusCampaignSettings
import org.openapitools.server.api.model.PlacementGroupType
import org.openapitools.server.api.model.PlacementTrafficType
import org.openapitools.server.api.model.PromotionApplicationLevel
import org.openapitools.server.api.model.SummaryStatus
import org.openapitools.server.api.model.TargetingSpecOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroup(
    val billableEvent: ActionType,
    /** Campaign ID of the ad group. */
    val campaignId: kotlin.String,
    /** oCPM learn mode */
    val conversionLearningModeType: ConversionLearningModeType,
    /** Ad group creation time. Unix timestamp in seconds. */
    val createdTime: kotlin.Int,
    /** Ad group ID. */
    val id: kotlin.String,
    /** Ad group name. */
    val name: kotlin.String,
    val summaryStatus: SummaryStatus,
    /** Always \&quot;adgroup\&quot;. */
    val type: kotlin.String = "adgroup",
    /** Ad group last update time. Unix timestamp in seconds. */
    val updatedTime: kotlin.Int,
    /** Advertiser ID. */
    val adAccountId: kotlin.String? = null,
    /** Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    val bidInMicroCurrency: kotlin.Int? = null,
    val bidStrategyType: BidStrategyType? = null,
    /** Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    val budgetInMicroCurrency: kotlin.Int? = null,
    /** Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. */
    val customerSegmentId: kotlin.String? = null,
    /** [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    val dcaAssets: kotlin.Any? = null,
    /** Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. */
    val endTime: kotlin.Int? = null,
    val extFeatures: AdgroupTrackingFeatures? = null,
    /** Feed Profile ID associated to the adgroup. */
    val feedProfileId: kotlin.String? = null,
    /** Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
    val isCreativeOptimization: kotlin.Boolean? = null,
    /** Indicates whether the ad group should use the local inventory. */
    val isLocalInventory: kotlin.Boolean? = null,
    /** Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. */
    val lifetimeFrequencyCap: kotlin.Int? = null,
    /** The targeting radius of the local inventory ads in miles. */
    val localInventoryRadiusInMiles: java.math.BigDecimal? = null,
    /** Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. */
    val optimizationGoalMetadata: NullableOptimizationGoalMetadata? = null,
    /** Pinterest Performance+ campaign settings. */
    val performancePlusCampaignSettings: PerformancePlusCampaignSettings? = null,
    /** [Placement group](https://help.pinterest.com/en/business/article/placement-groups). */
    val placementGroup: PlacementGroupType? = null,
    /** A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both */
    val placementTrafficType: PlacementTrafficType? = null,
    /** Specify if the promotion is applied at ad group or item level */
    val promotionApplicationLevel: PromotionApplicationLevel? = null,
    /** Promotion ID. To clear this field, set to null. */
    val promotionId: kotlin.String? = "0",
    /** Promotion IDs list. To clear this field, set to an empty array []. */
    val promotionIds: kotlin.collections.List<kotlin.String>? = null,
    /** Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    val startTime: kotlin.Int? = null,
    /** Ad group/entity status. */
    val status: EntityStatus? = null,
    val targetingSpec: TargetingSpecOptimal? = null,
    /** Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. */
    val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,
    val trackingUrls: AdGroupTrackingURLs? = null,
    /** Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
    val autoTargetingEnabled: kotlin.Boolean? = null,
    /** [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). */
    val bidMultiplier: java.math.BigDecimal? = null,
    val budgetType: BudgetType? = null,
    val pacingDeliveryType: PacingDeliveryType? = null
)
