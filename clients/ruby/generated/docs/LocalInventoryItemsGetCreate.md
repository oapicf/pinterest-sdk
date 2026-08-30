# PinterestSdkClient::LocalInventoryItemsGetCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_filters** | [**Array&lt;ItemIdStoreCodePair&gt;**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LocalInventoryItemsGetCreate.new(
  item_filters: null
)
```

