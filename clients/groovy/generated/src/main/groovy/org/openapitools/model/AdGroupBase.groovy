package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupTrackingURLs;
import org.openapitools.model.AdgroupTrackingFeatures;
import org.openapitools.model.BidStrategyType;
import org.openapitools.model.ConversionLearningModeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.NullableOptimizationGoalMetadata;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.PlacementTrafficType;
import org.openapitools.model.PromotionApplicationLevel;
import org.openapitools.model.SummaryStatus;
import org.openapitools.model.TargetingSpecOptimal;

@Canonical
class AdGroupBase {
    /* Advertiser ID. */
    String adAccountId
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    Integer bidInMicroCurrency
    
    BidStrategyType bidStrategyType
    
    ActionType billableEvent
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    Integer budgetInMicroCurrency
    /* Campaign ID of the ad group. */
    String campaignId
    /* oCPM learn mode */
    ConversionLearningModeType conversionLearningModeType
    /* Ad group creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. */
    String customerSegmentId
    /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    Object dcaAssets = null
    /* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. */
    Integer endTime
    
    AdgroupTrackingFeatures extFeatures
    /* Feed Profile ID associated to the adgroup. */
    String feedProfileId
    /* Ad group ID. */
    String id
    /* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
    Boolean isCreativeOptimization
    /* Indicates whether the ad group should use the local inventory. */
    Boolean isLocalInventory
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. */
    Integer lifetimeFrequencyCap
    /* The targeting radius of the local inventory ads in miles. */
    BigDecimal localInventoryRadiusInMiles
    /* Ad group name. */
    String name
    /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
    NullableOptimizationGoalMetadata optimizationGoalMetadata
    /* Pinterest Performance+ campaign settings. */
    PerformancePlusCampaignSettings performancePlusCampaignSettings
    /* [Placement group](https://help.pinterest.com/en/business/article/placement-groups). */
    PlacementGroupType placementGroup
    /* A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both */
    PlacementTrafficType placementTrafficType
    /* Specify if the promotion is applied at ad group or item level */
    PromotionApplicationLevel promotionApplicationLevel
    /* Promotion ID. To clear this field, set to null. */
    String promotionId = "0"
    /* Promotion IDs list. To clear this field, set to an empty array []. */
    List<String> promotionIds = new ArrayList<>()
    /* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    Integer startTime
    /* Ad group/entity status. */
    EntityStatus status
    
    SummaryStatus summaryStatus
    
    TargetingSpecOptimal targetingSpec
    /* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
    List<String> targetingTemplateIds
    
    AdGroupTrackingURLs trackingUrls
    /* Always \"adgroup\". */
    String type = "adgroup"
    /* Ad group last update time. Unix timestamp in seconds. */
    Integer updatedTime
}
