# LocalInventoryItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | **String** | Ad link for the item | [optional] 
**Availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**CreatedAt** | **Int64** | The millisecond timestamp when the local inventory item was created | 
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**LastUpdatedTime** | **Int64** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**Price** | **String** | The price of the product. It supports the following formats, &quot;&quot;49.99 USD&quot;&quot;, &quot;&quot;49.99USD&quot;&quot; and &quot;&quot;49.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**SalePrice** | **String** | The sale price of the product. It supports the following formats, &quot;&quot;24.99 USD&quot;&quot;, &quot;&quot;24.99USD&quot;&quot; and &quot;&quot;24.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**StoreMetadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 

## Examples

- Prepare the resource
```powershell
$LocalInventoryItemResponse = Initialize-PSOpenAPIToolsLocalInventoryItemResponse  -AdLink https://examplelink.com `
 -Availability in stock `
 -CreatedAt 1641483432072 `
 -ItemId DS0294-M `
 -LastUpdatedTime 1641483432072 `
 -Price 49.99 USD `
 -SalePrice 24.99 USD `
 -StoreMetadata null
```

- Convert the resource to JSON
```powershell
$LocalInventoryItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

