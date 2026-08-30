# ConversionProductReport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** | Message returned from the create report request | [optional] [readonly] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status | [optional] [readonly] 
**Size** | **Decimal** | Size of the report in bytes | [optional] [readonly] 
**Token** | **String** | Token returned from the create report request | [optional] [readonly] 
**Url** | **String** | URL of the report | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$ConversionProductReport = Initialize-PSOpenAPIToolsConversionProductReport  -Message null `
 -ReportStatus null `
 -Size null `
 -Token null `
 -Url null
```

- Convert the resource to JSON
```powershell
$ConversionProductReport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

