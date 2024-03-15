# PinMediaSourceImagesURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **String** |  | [optional] 
**Items** | [**PinMediaSourceImagesURLItemsInner[]**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**Index** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesURL = Initialize-PSOpenAPIToolsPinMediaSourceImagesURL  -SourceType null `
 -Items null `
 -Index null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

