# AdPinAnalytics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DATE** | **System.DateTime** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 
**PINID** | **String** | The ID of the pin that the metric belongs to. | 

## Examples

- Prepare the resource
```powershell
$AdPinAnalytics = Initialize-PSOpenAPIToolsAdPinAnalytics  -DATE null `
 -PINID null
```

- Convert the resource to JSON
```powershell
$AdPinAnalytics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

