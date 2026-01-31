# PinMediaSourceImagesURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** |  | [optional] 
**Items** | [**PinMediaSourceImagesURLItem[]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**SourceType** | **String** | The source type of the media. | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesURL = Initialize-PSOpenAPIToolsPinMediaSourceImagesURL  -Index null `
 -Items null `
 -SourceType null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

