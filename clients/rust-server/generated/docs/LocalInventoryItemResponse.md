# LocalInventoryItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **String** | Ad link for the item | [optional] [default to None]
**availability** | [***models::ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] [default to None]
**created_at** | **i64** | The millisecond timestamp when the local inventory item was created | 
**item_id** | **String** | The catalog item id in the merchant namespace | 
**last_updated_time** | **i64** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | **String** | The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. | [optional] [default to None]
**sale_price** | **String** | The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. | [optional] [default to None]
**store_metadata** | [***models::StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


