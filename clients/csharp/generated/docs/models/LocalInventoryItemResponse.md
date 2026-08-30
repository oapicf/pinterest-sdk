# Org.OpenAPITools.Model.LocalInventoryItemResponse
Local inventory item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **long** | The millisecond timestamp when the local inventory item was created | 
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**LastUpdatedTime** | **long** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**StoreMetadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 
**AdLink** | **string** | Ad link for the item | [optional] 
**Availability** | **ItemAvailability** | Availability status of the item | [optional] 
**Price** | **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**SalePrice** | **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

