# PinterestSdkClient::ItemUpsertBatchRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | The catalog item id in the merchant namespace | [optional] |
| **attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ItemUpsertBatchRecord.new(
  item_id: DS0294-M,
  attributes: null
)
```

