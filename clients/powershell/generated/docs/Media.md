# Media
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**MediaType** | [**MediaUploadType**](MediaUploadType.md) |  | 
**Status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$Media = Initialize-PSOpenAPIToolsMedia  -MediaId 12345 `
 -MediaType null `
 -Status null
```

- Convert the resource to JSON
```powershell
$Media | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

