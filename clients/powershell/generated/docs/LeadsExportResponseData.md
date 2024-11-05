# LeadsExportResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExportStatus** | [**LeadsExportStatus**](LeadsExportStatus.md) |  | [optional] 
**DownloadUrl** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadsExportResponseData = Initialize-PSOpenAPIToolsLeadsExportResponseData  -ExportStatus null `
 -DownloadUrl null
```

- Convert the resource to JSON
```powershell
$LeadsExportResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

