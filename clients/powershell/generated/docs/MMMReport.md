# MMMReport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** |  | [optional] [readonly] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] [readonly] 
**Size** | **Decimal** |  | [optional] [readonly] 
**Status** | **String** |  | [optional] [readonly] 
**Token** | **String** |  | [optional] [readonly] 
**Url** | **String** |  | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$MMMReport = Initialize-PSOpenAPIToolsMMMReport  -Message null `
 -ReportStatus null `
 -Size null `
 -Status success `
 -Token null `
 -Url null
```

- Convert the resource to JSON
```powershell
$MMMReport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

