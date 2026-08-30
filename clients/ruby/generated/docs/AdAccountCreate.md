# PinterestSdkClient::AdAccountCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  | [optional] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **name** | **String** | Ad account name. | [optional] |
| **owner_user_id** | **String** | Advertiser&#39;s owning user ID. | [optional] |
| **time_zone** | **String** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreate.new(
  country: null,
  currency: null,
  name: null,
  owner_user_id: null,
  time_zone: America/Los_Angeles
)
```

