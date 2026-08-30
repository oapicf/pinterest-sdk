# PinterestSdkClient::OrderLineMutationResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;OrderLineMutationError&gt;**](OrderLineMutationError.md) | Error list if update(s) fail. | [optional] |
| **order_line** | [**Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OrderLineMutationResult.new(
  errors: null,
  order_line: null
)
```

