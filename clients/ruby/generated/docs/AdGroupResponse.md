# PinterestSdkClient::AdGroupResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Ad group name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] |
| **budget_in_micro_currency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] |
| **bid_in_micro_currency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] |
| **optimization_goal_metadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  | [optional] |
| **budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] |
| **start_time** | **Integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] |
| **end_time** | **Integer** | Ad group end time. Unix timestamp in seconds. | [optional] |
| **targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |
| **lifetime_frequency_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] |
| **tracking_urls** | [**AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  | [optional] |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] |
| **pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] |
| **campaign_id** | **String** | Campaign ID of the ad group. | [optional] |
| **billable_event** | [**ActionType**](ActionType.md) |  | [optional] |
| **bid_strategy_type** | **String** | Bid strategy type | [optional] |
| **id** | **String** | Ad group ID. | [optional] |
| **ad_account_id** | **String** | Advertiser ID. | [optional] |
| **created_time** | **Integer** | Ad group creation time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | Ad group last update time. Unix timestamp in seconds. | [optional] |
| **type** | **String** | Always \&quot;adgroup\&quot;. | [optional][default to &#39;adgroup&#39;] |
| **conversion_learning_mode_type** | **String** | oCPM learn mode | [optional] |
| **summary_status** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] |
| **feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] |
| **dca_assets** | **Object** | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupResponse.new(
  name: Ad Group For Pin: 687195905986,
  status: null,
  budget_in_micro_currency: 5000000,
  bid_in_micro_currency: 5000000,
  optimization_goal_metadata: null,
  budget_type: null,
  start_time: 5686848000,
  end_time: 5705424000,
  targeting_spec: null,
  lifetime_frequency_cap: 100,
  tracking_urls: null,
  auto_targeting_enabled: true,
  placement_group: null,
  pacing_delivery_type: null,
  campaign_id: 626736533506,
  billable_event: null,
  bid_strategy_type: MAX_BID,
  id: 2680060704746,
  ad_account_id: 549755885175,
  created_time: 1476477189,
  updated_time: 1476477189,
  type: null,
  conversion_learning_mode_type: ACTIVE,
  summary_status: null,
  feed_profile_id: 626736533506,
  dca_assets: null
)
```

