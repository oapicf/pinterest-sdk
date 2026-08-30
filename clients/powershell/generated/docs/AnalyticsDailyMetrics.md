# AnalyticsDailyMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | [**DataStatus**](DataStatus.md) |  | [optional] 
**Date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**Metrics** | **System.Collections.Hashtable** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AnalyticsDailyMetrics = Initialize-PSOpenAPIToolsAnalyticsDailyMetrics  -DataStatus null `
 -Date 2019-12-01 `
 -Metrics null
```

- Convert the resource to JSON
```powershell
$AnalyticsDailyMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

