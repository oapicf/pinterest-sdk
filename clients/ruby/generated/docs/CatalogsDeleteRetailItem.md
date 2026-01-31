# PinterestSdkClient::CatalogsDeleteRetailItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | The catalog item id in the merchant namespace |  |
| **last_updated_time** | **Integer** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] |
| **operation** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsDeleteRetailItem.new(
  item_id: DS0294-M,
  last_updated_time: 1641483432072,
  operation: null
)
```

