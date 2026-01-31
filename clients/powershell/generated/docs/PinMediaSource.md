# PinMediaSource
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentType** | [**ContentType**](ContentType.md) |  | 
**VarData** | **String** |  | 
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]
**SourceType** | **String** |  | 
**Url** | **String** |  | 
**CoverImageContentType** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**CoverImageData** | **String** | Cover image Base64. | [optional] 
**CoverImageKeyFrameTime** | **Int32** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**CoverImageUrl** | **String** | Cover image URL. | [optional] 
**MediaId** | **String** |  | 
**Index** | **Int32** |  | [optional] 
**Items** | [**PinMediaSourceImagesURLItem[]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**IsAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$PinMediaSource = Initialize-PSOpenAPIToolsPinMediaSource  -ContentType null `
 -VarData null `
 -IsStandard null `
 -SourceType null `
 -Url null `
 -CoverImageContentType null `
 -CoverImageData null `
 -CoverImageKeyFrameTime null `
 -CoverImageUrl null `
 -MediaId null `
 -Index null `
 -Items null `
 -IsAffiliateLink null
```

- Convert the resource to JSON
```powershell
$PinMediaSource | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

