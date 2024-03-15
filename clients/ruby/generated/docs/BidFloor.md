# PinterestSdkClient::BidFloor

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_floors** | **Array&lt;Integer&gt;** | A list of bid floors in micro currency. For example, [100000, 200000] | [optional] |
| **type** | **String** | Always the string &#39;bidfloor&#39; | [optional][default to &#39;bidfloor&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BidFloor.new(
  bid_floors: [100000,200000],
  type: bidfloor
)
```

