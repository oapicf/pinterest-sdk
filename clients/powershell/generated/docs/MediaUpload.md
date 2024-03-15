# MediaUpload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] 
**MediaType** | [**MediaUploadType**](MediaUploadType.md) |  | [optional] 
**UploadUrl** | **String** | The URL where you will POST your media file. | [optional] 
**UploadParameters** | [**MediaUploadAllOfUploadParameters**](MediaUploadAllOfUploadParameters.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MediaUpload = Initialize-PSOpenAPIToolsMediaUpload  -MediaId null `
 -MediaType null `
 -UploadUrl https://pinterest-media-upload.s3-accelerate.amazonaws.com/ `
 -UploadParameters null
```

- Convert the resource to JSON
```powershell
$MediaUpload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

