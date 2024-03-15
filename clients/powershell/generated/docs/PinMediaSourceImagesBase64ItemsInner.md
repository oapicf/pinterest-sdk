# PinMediaSourceImagesBase64ItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** | Destination link for the image. | [optional] 
**ContentType** | **String** |  | 
**VarData** | **String** | Image to upload as base64 string. | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesBase64ItemsInner = Initialize-PSOpenAPIToolsPinMediaSourceImagesBase64ItemsInner  -Title null `
 -Description null `
 -Link null `
 -ContentType null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesBase64ItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

