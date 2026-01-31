# PinMediaSourceImagesBase64
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** |  | [optional] 
**Items** | [**PinMediaSourceImagesBase64Item[]**](PinMediaSourceImagesBase64Item.md) | Array with image objects. | 
**SourceType** | **String** | The source type of the media. | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesBase64 = Initialize-PSOpenAPIToolsPinMediaSourceImagesBase64  -Index null `
 -Items null `
 -SourceType null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesBase64 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

