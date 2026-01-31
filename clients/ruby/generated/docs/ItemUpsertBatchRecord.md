# PinterestSdkClient::ItemUpsertBatchRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] |
| **item_id** | **String** | The catalog item id in the merchant namespace | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ItemUpsertBatchRecord.new(
  attributes: null,
  item_id: DS0294-M
)
```

