# PinterestSdkClient::TargetingSpecSHOPPINGRETARGETING

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **lookback_window** | **Integer** | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] |
| **tag_types** | **Array&lt;Integer&gt;** | Event types to target for dynamic retargeting | [optional] |
| **exclusion_window** | **Integer** | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingSpecSHOPPINGRETARGETING.new(
  lookback_window: 30,
  tag_types: [0,6],
  exclusion_window: 14
)
```

