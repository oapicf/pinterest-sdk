# TemplateBasedReport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**TemplateId** | **String** | Unique identifier of a template. | 
**Token** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateBasedReport = Initialize-PSOpenAPIToolsTemplateBasedReport  -Message null `
 -ReportStatus null `
 -TemplateId null `
 -Token null
```

- Convert the resource to JSON
```powershell
$TemplateBasedReport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

