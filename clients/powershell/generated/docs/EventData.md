# EventData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**Currency**](Currency.md) | Currency. For example, &#39;USD&#39;. | [optional] 
**LeadType** | **String** | Promotion code. For example, &#39;Newsletter&#39;. | [optional] 
**LineItems** | [**LineItem**](LineItem.md) |  | [optional] 
**OrderId** | **String** | Order ID. For example, &#39;X-151481&#39;. | [optional] 
**OrderQuantity** | **Int32** | Order quantity. For example, 1. | [optional] 
**PageName** | **String** | Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. | [optional] 
**PromoCode** | **String** | Promotion code. For example, &#39;WINTER10&#39;. | [optional] 
**Property** | **String** | Property. For example, &#39;Athleta&#39;. | [optional] 
**SearchQuery** | **String** | Search query string. For example, &#39;boots&#39;. | [optional] 
**Value** | **String** | Product value. For example, &#39;199.98&#39;. | [optional] 
**VideoTitle** | **String** | Video title. For example, &#39;How to style your Parker Boots&#39;. | [optional] 

## Examples

- Prepare the resource
```powershell
$EventData = Initialize-PSOpenAPIToolsEventData  -Currency null `
 -LeadType Newsletter `
 -LineItems null `
 -OrderId X-151481 `
 -OrderQuantity 1 `
 -PageName Our Favorite Pins on Pinterest `
 -PromoCode WINTER10 `
 -Property Athleta `
 -SearchQuery boots `
 -Value 199.98 `
 -VideoTitle How to style your Parker Boots
```

- Convert the resource to JSON
```powershell
$EventData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

