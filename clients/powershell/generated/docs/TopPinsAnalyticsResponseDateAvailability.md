# TopPinsAnalyticsResponseDateAvailability
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsRealtime** | **Boolean** |  | [optional] 
**LatestAvailableTimestamp** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TopPinsAnalyticsResponseDateAvailability = Initialize-PSOpenAPIToolsTopPinsAnalyticsResponseDateAvailability  -IsRealtime false `
 -LatestAvailableTimestamp 1649116799000
```

- Convert the resource to JSON
```powershell
$TopPinsAnalyticsResponseDateAvailability | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

