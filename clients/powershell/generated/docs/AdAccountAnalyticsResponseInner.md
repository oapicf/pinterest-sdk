# AdAccountAnalyticsResponseInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADACCOUNTID** | **String** | The ID of the advertiser that this metrics belongs to. | 
**DATE** | **System.DateTime** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountAnalyticsResponseInner = Initialize-PSOpenAPIToolsAdAccountAnalyticsResponseInner  -ADACCOUNTID null `
 -DATE null
```

- Convert the resource to JSON
```powershell
$AdAccountAnalyticsResponseInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

