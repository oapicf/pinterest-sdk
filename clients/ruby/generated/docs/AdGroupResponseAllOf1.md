# PinterestSdkClient::AdGroupResponseAllOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
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

instance = PinterestSdkClient::AdGroupResponseAllOf1.new(
  campaign_id: 626736533506,
  billable_event: null,
  id: 2680060704746,
  type: null,
  ad_account_id: 549755885175,
  created_time: 1476477189,
  updated_time: 1476477189
)
```

