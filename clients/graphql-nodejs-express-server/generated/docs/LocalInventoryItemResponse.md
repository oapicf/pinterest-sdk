# LocalInventoryItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adLink** | **String!** | Ad link for the item | [optional] [default to null]
**availability** | [***ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] [default to null]
**createdAt** | **Int!** | The millisecond timestamp when the local inventory item was created | [default to null]
**itemId** | **String!** | The catalog item id in the merchant namespace | [default to null]
**lastUpdatedTime** | **Int!** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | [default to null]
**price** | **String!** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null]
**salePrice** | **String!** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null]
**storeMetadata** | [***StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


