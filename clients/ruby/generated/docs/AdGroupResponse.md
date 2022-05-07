# PinterestSdkClient::AdGroupResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Ad group name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] |
| **budget_in_micro_currency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] |
| **bid_in_micro_currency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] |
| **budget_type** | **String** | Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. | [optional] |
| **start_time** | **Integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] |
| **end_time** | **Integer** | Ad group end time. Unix timestamp in seconds. | [optional] |
| **targeting_spec** | **Hash&lt;String, Array&lt;String&gt;&gt;** | Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39; | [optional] |
| **lifetime_frequency_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;. | [optional] |
| **pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) | Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. | [optional] |
| **conversion_learning_mode_type** | **String** | oCPM learn mode | [optional] |
| **summary_status** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] |
| **feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] |
| **campaign_id** | **String** | Campaign ID of the ad group. | [optional] |
| **billable_event** | [**ActionType**](ActionType.md) |  | [optional] |
| **id** | **String** | Ad group ID. | [optional] |
| **type** | **String** | Always \&quot;adgroup\&quot;. | [optional] |
| **ad_account_id** | **String** | Advertiser ID. | [optional] |
| **created_time** | **Integer** | Ad group creation time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | Ad group last update time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupResponse.new(
  name: Ad Group For Pin: 687195905986,
  status: null,
  budget_in_micro_currency: 5000000,
  bid_in_micro_currency: 5000000,
  budget_type: null,
  start_time: 5686848000,
  end_time: 5705424000,
  targeting_spec: null,
  lifetime_frequency_cap: 100,
  tracking_urls: null,
  auto_targeting_enabled: true,
  placement_group: null,
  pacing_delivery_type: null,
  conversion_learning_mode_type: ACTIVE,
  summary_status: null,
  feed_profile_id: 626736533506,
  campaign_id: 626736533506,
  billable_event: null,
  id: 2680060704746,
  type: null,
  ad_account_id: 549755885175,
  created_time: 1476477189,
  updated_time: 1476477189
)
```

