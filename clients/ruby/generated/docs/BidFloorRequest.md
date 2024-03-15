# PinterestSdkClient::BidFloorRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_floor_specs** | [**Array&lt;BidFloorSpec&gt;**](BidFloorSpec.md) |  |  |
| **targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BidFloorRequest.new(
  bid_floor_specs: null,
  targeting_spec: null
)
```

