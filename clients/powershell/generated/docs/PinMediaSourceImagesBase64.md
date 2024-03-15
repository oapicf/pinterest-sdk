# PinMediaSourceImagesBase64
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **String** |  | [optional] 
**Items** | [**PinMediaSourceImagesBase64ItemsInner[]**](PinMediaSourceImagesBase64ItemsInner.md) | Array with image objects. | 
**Index** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesBase64 = Initialize-PSOpenAPIToolsPinMediaSourceImagesBase64  -SourceType null `
 -Items null `
 -Index null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesBase64 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

