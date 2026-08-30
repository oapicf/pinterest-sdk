# PinterestSdkClient::LocalInventoryItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_link** | **String** | Ad link for the item | [optional] |
| **availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] |
| **created_at** | **Integer** | The millisecond timestamp when the local inventory item was created |  |
| **item_id** | **String** | The catalog item id in the merchant namespace |  |
| **last_updated_time** | **Integer** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. |  |
| **price** | **String** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] |
| **sale_price** | **String** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] |
| **store_metadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LocalInventoryItemResponse.new(
  ad_link: https://examplelink.com,
  availability: in stock,
  created_at: 1641483432072,
  item_id: DS0294-M,
  last_updated_time: 1641483432072,
  price: 49.99 USD,
  sale_price: 24.99 USD,
  store_metadata: null
)
```

