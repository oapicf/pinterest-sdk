# PinterestSdkClient::OrderLineResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;OrderLineError&gt;**](OrderLineError.md) | Error list if update(s) fail. | [optional] |
| **order_line** | [**Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OrderLineResponse.new(
  errors: null,
  order_line: null
)
```

