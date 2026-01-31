# PinterestSdkClient::AdGroupResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. | [optional] |
| **bid_in_micro_currency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. | [optional] |
| **bid_strategy_type** | **String** | Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;. | [optional] |
| **billable_event** | [**ActionType**](ActionType.md) |  | [optional] |
| **budget_in_micro_currency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] |
| **budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] |
| **campaign_id** | **String** | Campaign ID of the ad group. | [optional] |
| **end_time** | **Integer** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] |
| **is_creative_optimization** | **Boolean** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] |
| **lifetime_frequency_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] |
| **name** | **String** | Ad group name. | [optional] |
| **optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] |
| **pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] |
| **promotion_application_level** | **String** | Specify if the promotion is applied at ad group or item level | [optional] |
| **promotion_id** | **String** | Promotion ID. To clear this field, set to null. | [optional][default to &#39;0&#39;] |
| **start_time** | **Integer** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] |
| **targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |
| **targeting_template_ids** | **Array&lt;String&gt;** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] |
| **ad_account_id** | **String** | Advertiser ID. | [optional] |
| **bid_multiplier** | **Float** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] |
| **conversion_learning_mode_type** | **String** | oCPM learn mode | [optional] |
| **created_time** | **Integer** | Ad group creation time. Unix timestamp in seconds. | [optional] |
| **dca_assets** | **Object** | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] |
| **feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] |
| **id** | **String** | Ad group ID. | [optional] |
| **summary_status** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] |
| **type** | **String** | Always \&quot;adgroup\&quot;. | [optional][default to &#39;adgroup&#39;] |
| **updated_time** | **Integer** | Ad group last update time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupResponse.new(
  auto_targeting_enabled: true,
  bid_in_micro_currency: 5000000,
  bid_strategy_type: MAX_BID,
  billable_event: null,
  budget_in_micro_currency: 5000000,
  budget_type: null,
  campaign_id: 626736533506,
  end_time: 5705424000,
  is_creative_optimization: true,
  lifetime_frequency_cap: 100,
  name: Ad Group For Pin: 687195905986,
  optimization_goal_metadata: null,
  pacing_delivery_type: null,
  placement_group: null,
  promotion_application_level: ITEM,
  promotion_id: 7834020347906,
  start_time: 5686848000,
  status: null,
  targeting_spec: null,
  targeting_template_ids: null,
  tracking_urls: null,
  ad_account_id: 549755885175,
  bid_multiplier: 1,
  conversion_learning_mode_type: ACTIVE,
  created_time: 1476477189,
  dca_assets: null,
  feed_profile_id: 626736533506,
  id: 2680060704746,
  summary_status: null,
  type: null,
  updated_time: 1476477189
)
```

