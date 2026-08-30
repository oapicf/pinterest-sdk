# PinterestSdkClient::AdGroupUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Advertiser ID. | [optional][readonly] |
| **bid_in_micro_currency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] |
| **bid_strategy_type** | [**BidStrategyType**](BidStrategyType.md) |  | [optional] |
| **billable_event** | [**ActionType**](ActionType.md) |  |  |
| **budget_in_micro_currency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] |
| **campaign_id** | **String** | Campaign ID of the ad group. |  |
| **conversion_learning_mode_type** | [**ConversionLearningModeType**](ConversionLearningModeType.md) | oCPM learn mode | [readonly] |
| **created_time** | **Integer** | Ad group creation time. Unix timestamp in seconds. | [readonly] |
| **customer_segment_id** | **String** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] |
| **dca_assets** | **Object** | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional][readonly] |
| **end_time** | **Integer** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] |
| **ext_features** | [**AdgroupTrackingFeatures**](AdgroupTrackingFeatures.md) |  | [optional] |
| **feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] |
| **id** | **String** | Ad group ID. |  |
| **is_creative_optimization** | **Boolean** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] |
| **is_local_inventory** | **Boolean** | Indicates whether the ad group should use the local inventory. | [optional] |
| **lifetime_frequency_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] |
| **local_inventory_radius_in_miles** | **Float** | The targeting radius of the local inventory ads in miles. | [optional] |
| **name** | **String** | Ad group name. |  |
| **optimization_goal_metadata** | [**NullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] |
| **performance_plus_campaign_settings** | [**PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] |
| **placement_traffic_type** | [**PlacementTrafficType**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] |
| **promotion_application_level** | [**PromotionApplicationLevel**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] |
| **promotion_id** | **String** | Promotion ID. To clear this field, set to null. | [optional][default to &#39;0&#39;] |
| **promotion_ids** | **Array&lt;String&gt;** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] |
| **start_time** | **Integer** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] |
| **summary_status** | [**SummaryStatus**](SummaryStatus.md) |  | [readonly] |
| **targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] |
| **targeting_template_ids** | **Array&lt;String&gt;** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] |
| **tracking_urls** | [**AdGroupTrackingURLs**](AdGroupTrackingURLs.md) |  | [optional] |
| **type** | **String** | Always \&quot;adgroup\&quot;. | [readonly][default to &#39;adgroup&#39;] |
| **updated_time** | **Integer** | Ad group last update time. Unix timestamp in seconds. | [readonly] |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] |
| **bid_multiplier** | **Float** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] |
| **budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] |
| **pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupUpdate.new(
  ad_account_id: null,
  bid_in_micro_currency: null,
  bid_strategy_type: null,
  billable_event: null,
  budget_in_micro_currency: null,
  campaign_id: null,
  conversion_learning_mode_type: null,
  created_time: null,
  customer_segment_id: null,
  dca_assets: null,
  end_time: null,
  ext_features: null,
  feed_profile_id: null,
  id: null,
  is_creative_optimization: null,
  is_local_inventory: null,
  lifetime_frequency_cap: null,
  local_inventory_radius_in_miles: null,
  name: null,
  optimization_goal_metadata: null,
  performance_plus_campaign_settings: null,
  placement_group: null,
  placement_traffic_type: null,
  promotion_application_level: ITEM,
  promotion_id: null,
  promotion_ids: null,
  start_time: null,
  status: null,
  summary_status: null,
  targeting_spec: null,
  targeting_template_ids: null,
  tracking_urls: null,
  type: null,
  updated_time: null,
  auto_targeting_enabled: null,
  bid_multiplier: null,
  budget_type: null,
  pacing_delivery_type: null
)
```

