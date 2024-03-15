# GetMMMReportResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | **String** |  | [optional] 
**Url** | **String** |  | [optional] 
**Size** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetMMMReportResponseData = Initialize-PSOpenAPIToolsGetMMMReportResponseData  -ReportStatus null `
 -Url null `
 -Size null
```

- Convert the resource to JSON
```powershell
$GetMMMReportResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

