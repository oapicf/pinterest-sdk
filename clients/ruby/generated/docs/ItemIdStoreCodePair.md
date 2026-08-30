# PinterestSdkClient::ItemIdStoreCodePair

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | Catalog item id in the merchant namespace |  |
| **store_code** | **String** | Store code for the local inventory item |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ItemIdStoreCodePair.new(
  item_id: item_id_1,
  store_code: store_1
)
```

