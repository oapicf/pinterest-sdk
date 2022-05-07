# PinterestSdkClient::CampaignCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Campaign&#39;s Advertiser ID. |  |
| **name** | **String** | Campaign name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional][default to &#39;ACTIVE&#39;] |
| **lifetime_spend_cap** | **Integer** | Campaign total spending cap. | [optional] |
| **daily_spend_cap** | **Integer** | Campaign daily spending cap. | [optional] |
| **order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **start_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |
| **end_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignCommon.new(
  ad_account_id: 549755885175,
  name: ACME Tools,
  status: null,
  lifetime_spend_cap: 1432744744,
  daily_spend_cap: 1432744744,
  order_line_id: 549755885175,
  tracking_urls: null,
  start_time: 1580865126,
  end_time: 1644023526
)
```

