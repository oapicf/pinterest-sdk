# AdGroupsAnalyticsResponseInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADGROUPID** | **String** | The ID of the ad group that this metrics belongs to. | 
**DATE** | **System.DateTime** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupsAnalyticsResponseInner = Initialize-PSOpenAPIToolsAdGroupsAnalyticsResponseInner  -ADGROUPID null `
 -DATE null
```

- Convert the resource to JSON
```powershell
$AdGroupsAnalyticsResponseInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

