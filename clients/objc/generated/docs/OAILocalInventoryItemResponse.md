# OAILocalInventoryItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adLink** | **NSString*** | Ad link for the item | [optional] 
**availability** | [**OAIItemAvailability***](OAIItemAvailability.md) | Availability status of the item | [optional] 
**createdAt** | **NSNumber*** | The millisecond timestamp when the local inventory item was created | 
**itemId** | **NSString*** | The catalog item id in the merchant namespace | 
**lastUpdatedTime** | **NSNumber*** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | **NSString*** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**salePrice** | **NSString*** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**storeMetadata** | [**OAIStoreMetadata***](OAIStoreMetadata.md) | Store metadata for this local inventory item | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


