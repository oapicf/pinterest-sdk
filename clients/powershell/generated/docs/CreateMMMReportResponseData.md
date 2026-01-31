# CreateMMMReportResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Status** | **String** |  | [optional] 
**Token** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateMMMReportResponseData = Initialize-PSOpenAPIToolsCreateMMMReportResponseData  -Message null `
 -ReportStatus null `
 -Status success `
 -Token null
```

- Convert the resource to JSON
```powershell
$CreateMMMReportResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

