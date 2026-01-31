# MediaUpload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**MediaType** | [**MediaUploadType**](MediaUploadType.md) |  | 
**UploadParameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] 
**UploadUrl** | **String** | The URL where you will POST your media file. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$MediaUpload = Initialize-PSOpenAPIToolsMediaUpload  -MediaId 12345 `
 -MediaType null `
 -UploadParameters null `
 -UploadUrl https://pinterest-media-upload.s3-accelerate.amazonaws.com/
```

- Convert the resource to JSON
```powershell
$MediaUpload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

