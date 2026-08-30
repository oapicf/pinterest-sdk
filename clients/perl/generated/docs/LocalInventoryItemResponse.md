# WWW::OpenAPIClient::Object::LocalInventoryItemResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LocalInventoryItemResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **string** | Ad link for the item | [optional] 
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**created_at** | **int** | The millisecond timestamp when the local inventory item was created | 
**item_id** | **string** | The catalog item id in the merchant namespace | 
**last_updated_time** | **int** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**sale_price** | **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**store_metadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


