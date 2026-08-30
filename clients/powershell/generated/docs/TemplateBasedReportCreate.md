# TemplateBasedReportCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**Token** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateBasedReportCreate = Initialize-PSOpenAPIToolsTemplateBasedReportCreate  -Message null `
 -ReportStatus null `
 -Token null
```

- Convert the resource to JSON
```powershell
$TemplateBasedReportCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

