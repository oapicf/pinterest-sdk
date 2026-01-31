# ProductCategoriesMetricsHighlights
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Engagement** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Engagement metric value | [optional] 
**OutboundClicks** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Number of outbound clicks | [optional] 
**PinSaves** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Number of pin saves | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductCategoriesMetricsHighlights = Initialize-PSOpenAPIToolsProductCategoriesMetricsHighlights  -Engagement null `
 -OutboundClicks null `
 -PinSaves null
```

- Convert the resource to JSON
```powershell
$ProductCategoriesMetricsHighlights | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

