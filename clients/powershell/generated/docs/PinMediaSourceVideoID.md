# PinMediaSourceVideoID
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **String** |  | 
**CoverImageUrl** | **String** | Cover image url. | [optional] 
**CoverImageContentType** | **String** | Content type for cover image Base64. | [optional] 
**CoverImageData** | **String** | Cover image Base64. | [optional] 
**MediaId** | **String** |  | 
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]

## Examples

- Prepare the resource
```powershell
$PinMediaSourceVideoID = Initialize-PSOpenAPIToolsPinMediaSourceVideoID  -SourceType null `
 -CoverImageUrl null `
 -CoverImageContentType null `
 -CoverImageData null `
 -MediaId null `
 -IsStandard null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceVideoID | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

