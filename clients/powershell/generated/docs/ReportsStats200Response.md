# ReportsStats200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CatalogsReportStats[]**](CatalogsReportStats.md) |  | 

## Examples

- Prepare the resource
```powershell
$ReportsStats200Response = Initialize-PSOpenAPIToolsReportsStats200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$ReportsStats200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

