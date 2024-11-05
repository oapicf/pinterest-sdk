# ReportsStats200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CatalogsReportStats[]**](CatalogsReportStats.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ReportsStats200Response = Initialize-PSOpenAPIToolsReportsStats200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$ReportsStats200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

