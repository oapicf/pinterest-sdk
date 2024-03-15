# ProductGroupAnalyticsResponseInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PRODUCTGROUPID** | **String** | The ID of the product group that this metrics belongs to. | 
**DATE** | **System.DateTime** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductGroupAnalyticsResponseInner = Initialize-PSOpenAPIToolsProductGroupAnalyticsResponseInner  -PRODUCTGROUPID null `
 -DATE null
```

- Convert the resource to JSON
```powershell
$ProductGroupAnalyticsResponseInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

