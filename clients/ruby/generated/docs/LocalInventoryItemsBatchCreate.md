# PinterestSdkClient::LocalInventoryItemsBatchCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operations** | [**Array&lt;LocalInventoryOperation&gt;**](LocalInventoryOperation.md) | Array of inventory operations. Up to 1000 items per request. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LocalInventoryItemsBatchCreate.new(
  operations: null
)
```

