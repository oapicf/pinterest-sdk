
# LocalInventoryItemResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | **kotlin.Long** | The millisecond timestamp when the local inventory item was created |  |
| **itemId** | **kotlin.String** | The catalog item id in the merchant namespace |  |
| **lastUpdatedTime** | **kotlin.Long** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. |  |
| **storeMetadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item |  |
| **adLink** | **kotlin.String** | Ad link for the item |  [optional] |
| **availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item |  [optional] |
| **price** | **kotlin.String** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. |  [optional] |
| **salePrice** | **kotlin.String** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional] |



