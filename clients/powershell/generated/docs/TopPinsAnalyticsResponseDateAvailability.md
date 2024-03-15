# TopPinsAnalyticsResponseDateAvailability
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LatestAvailableTimestamp** | **Decimal** |  | [optional] 
**IsRealtime** | **Boolean** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TopPinsAnalyticsResponseDateAvailability = Initialize-PSOpenAPIToolsTopPinsAnalyticsResponseDateAvailability  -LatestAvailableTimestamp 1649116799000 `
 -IsRealtime false
```

- Convert the resource to JSON
```powershell
$TopPinsAnalyticsResponseDateAvailability | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

