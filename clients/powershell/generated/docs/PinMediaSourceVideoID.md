# PinMediaSourceVideoID
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CoverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**CoverImageData** | **String** | Cover image Base64. | [optional] 
**CoverImageKeyFrameTime** | **Int32** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**CoverImageUrl** | **String** | Cover image URL. | [optional] 
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]
**MediaId** | **String** |  | 
**SourceType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceVideoID = Initialize-PSOpenAPIToolsPinMediaSourceVideoID  -CoverImageContentType null `
 -CoverImageData null `
 -CoverImageKeyFrameTime null `
 -CoverImageUrl null `
 -IsStandard null `
 -MediaId null `
 -SourceType null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceVideoID | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

