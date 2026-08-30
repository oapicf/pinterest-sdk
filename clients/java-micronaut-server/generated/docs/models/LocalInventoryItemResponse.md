

# LocalInventoryItemResponse

Local inventory item response

The class is defined in **[LocalInventoryItemResponse.java](../../src/main/java/org/openapitools/model/LocalInventoryItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adLink** | `String` | Ad link for the item |  [optional property]
**availability** | `ItemAvailability` | Availability status of the item |  [optional property]
**createdAt** | `Long` | The millisecond timestamp when the local inventory item was created | 
**itemId** | `String` | The catalog item id in the merchant namespace | 
**lastUpdatedTime** | `Long` | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | `String` | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. |  [optional property]
**salePrice** | `String` | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional property]
**storeMetadata** | [`StoreMetadata`](StoreMetadata.md) | Store metadata for this local inventory item | 










