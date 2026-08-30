# RetailLocalInventoryItemAttributesOptional
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | **String** | Ad link for the item | [optional] 
**Availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**Price** | **String** | The price of the product. It supports the following formats, &quot;&quot;49.99 USD&quot;&quot;, &quot;&quot;49.99USD&quot;&quot; and &quot;&quot;49.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**SalePrice** | **String** | The sale price of the product. It supports the following formats, &quot;&quot;24.99 USD&quot;&quot;, &quot;&quot;24.99USD&quot;&quot; and &quot;&quot;24.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 

## Examples

- Prepare the resource
```powershell
$RetailLocalInventoryItemAttributesOptional = Initialize-PSOpenAPIToolsRetailLocalInventoryItemAttributesOptional  -AdLink https://examplelink.com `
 -Availability in stock `
 -Price 49.99 USD `
 -SalePrice 24.99 USD
```

- Convert the resource to JSON
```powershell
$RetailLocalInventoryItemAttributesOptional | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

