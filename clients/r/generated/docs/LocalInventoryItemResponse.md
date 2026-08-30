# openapi::LocalInventoryItemResponse

Local inventory item response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **character** | Ad link for the item | [optional] 
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] [Enum: ] 
**created_at** | **integer** | The millisecond timestamp when the local inventory item was created | 
**item_id** | **character** | The catalog item id in the merchant namespace | 
**last_updated_time** | **integer** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | **character** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**sale_price** | **character** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**store_metadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 


