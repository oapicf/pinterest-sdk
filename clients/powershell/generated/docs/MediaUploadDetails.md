# MediaUploadDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **String** |  | [optional] [readonly] 
**MediaType** | [**MediaUploadType**](MediaUploadType.md) |  | [optional] [readonly] 
**Status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$MediaUploadDetails = Initialize-PSOpenAPIToolsMediaUploadDetails  -MediaId null `
 -MediaType null `
 -Status null
```

- Convert the resource to JSON
```powershell
$MediaUploadDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

