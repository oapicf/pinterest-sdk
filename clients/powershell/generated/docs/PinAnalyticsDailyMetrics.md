# PinAnalyticsDailyMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | [**DataStatus**](DataStatus.md) |  | [optional] 
**Date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**Metrics** | **System.Collections.Hashtable** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinAnalyticsDailyMetrics = Initialize-PSOpenAPIToolsPinAnalyticsDailyMetrics  -DataStatus null `
 -Date null `
 -Metrics null
```

- Convert the resource to JSON
```powershell
$PinAnalyticsDailyMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

