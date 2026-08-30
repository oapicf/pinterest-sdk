# LOCAL_INVENTORY_ITEM_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | [**STRING_32**](STRING_32.md) | Ad link for the item | [optional] [default to null]
**availability** | [**ITEM_AVAILABILITY**](ItemAvailability.md) | Availability status of the item | [optional] [default to null]
**created_at** | **INTEGER_64** | The millisecond timestamp when the local inventory item was created | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The catalog item id in the merchant namespace | [default to null]
**last_updated_time** | **INTEGER_64** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | [default to null]
**price** | [**STRING_32**](STRING_32.md) | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null]
**sale_price** | [**STRING_32**](STRING_32.md) | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null]
**store_metadata** | [**STORE_METADATA**](StoreMetadata.md) | Store metadata for this local inventory item | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


