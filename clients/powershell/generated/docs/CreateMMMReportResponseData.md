# CreateMMMReportResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Token** | **String** |  | [optional] 
**Message** | **String** |  | [optional] 
**Status** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateMMMReportResponseData = Initialize-PSOpenAPIToolsCreateMMMReportResponseData  -ReportStatus null `
 -Token null `
 -Message null `
 -Status success
```

- Convert the resource to JSON
```powershell
$CreateMMMReportResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

