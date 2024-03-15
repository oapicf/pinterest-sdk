# PinterestTagEventData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**LeadType** | **String** | Promotion code. For example, &quot;&quot;Newsletter&quot;&quot;. | [optional] 
**LineItems** | [**LineItem**](LineItem.md) |  | [optional] 
**OrderId** | **String** | Order ID. For example, &quot;&quot;X-151481&quot;&quot;. | [optional] 
**OrderQuantity** | **Int32** | Order quantity. For example, 1. | [optional] 
**PageName** | **String** | Page name. For example, &quot;&quot;Our Favorite Pins on Pinterest&quot;&quot;. | [optional] 
**PromoCode** | **String** | Promotion code. For example, &quot;&quot;WINTER10&quot;&quot;. | [optional] 
**Property** | **String** | Property. For example, &quot;&quot;Athleta&quot;&quot;. | [optional] 
**SearchQuery** | **String** | Search query string. For example, &quot;&quot;boots&quot;&quot;. | [optional] 
**Value** | **String** | Product value. For example, &quot;&quot;199.98&quot;&quot; | [optional] 
**VideoTitle** | **String** | Video title. For example, &quot;&quot;How to style your Parker Boots&quot;&quot;. | [optional] 

## Examples

- Prepare the resource
```powershell
$PinterestTagEventData = Initialize-PSOpenAPIToolsPinterestTagEventData  -Currency null `
 -LeadType Newsletter `
 -LineItems null `
 -OrderId X-151481 `
 -OrderQuantity 1 `
 -PageName Our Favorite Pins on Pinterest. `
 -PromoCode WINTER10 `
 -Property Athleta `
 -SearchQuery boots `
 -Value 199.98 `
 -VideoTitle How to style your Parker Boots
```

- Convert the resource to JSON
```powershell
$PinterestTagEventData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

