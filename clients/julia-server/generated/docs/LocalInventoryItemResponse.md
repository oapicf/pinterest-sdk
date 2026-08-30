# LocalInventoryItemResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_link`** | **`String`** | Ad link for the item | [optional] [default to nothing]
**`availability`** | [**`*ItemAvailability`**](ItemAvailability.md) | Availability status of the item | [optional] [default to nothing]
**`created_at`** | **`Int64`** | The millisecond timestamp when the local inventory item was created | [default to nothing]
**`item_id`** | **`String`** | The catalog item id in the merchant namespace | [default to nothing]
**`last_updated_time`** | **`Int64`** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | [default to nothing]
**`price`** | **`String`** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to nothing]
**`sale_price`** | **`String`** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to nothing]
**`store_metadata`** | [**`*StoreMetadata`**](StoreMetadata.md) | Store metadata for this local inventory item | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


