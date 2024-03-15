# PinMediaSource
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **String** |  | 
**ContentType** | **String** |  | 
**VarData** | **String** |  | 
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]
**Url** | **String** |  | 
**CoverImageUrl** | **String** | Cover image url. | [optional] 
**CoverImageContentType** | **String** | Content type for cover image Base64. | [optional] 
**CoverImageData** | **String** | Cover image Base64. | [optional] 
**MediaId** | **String** |  | 
**Items** | [**PinMediaSourceImagesURLItemsInner[]**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**Index** | **Int32** |  | [optional] 
**IsAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$PinMediaSource = Initialize-PSOpenAPIToolsPinMediaSource  -SourceType null `
 -ContentType null `
 -VarData null `
 -IsStandard null `
 -Url null `
 -CoverImageUrl null `
 -CoverImageContentType null `
 -CoverImageData null `
 -MediaId null `
 -Items null `
 -Index null `
 -IsAffiliateLink null
```

- Convert the resource to JSON
```powershell
$PinMediaSource | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

