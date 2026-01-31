# LeadsExportResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadUrl** | **String** |  | [optional] 
**ExportStatus** | [**LeadsExportStatus**](LeadsExportStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadsExportResponseData = Initialize-PSOpenAPIToolsLeadsExportResponseData  -DownloadUrl null `
 -ExportStatus null
```

- Convert the resource to JSON
```powershell
$LeadsExportResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

