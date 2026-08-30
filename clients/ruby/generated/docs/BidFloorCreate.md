# PinterestSdkClient::BidFloorCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_floor_specs** | [**Array&lt;BidFloorSpec&gt;**](BidFloorSpec.md) | List of bid floor specifications. |  |
| **targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BidFloorCreate.new(
  bid_floor_specs: null,
  targeting_spec: null
)
```

