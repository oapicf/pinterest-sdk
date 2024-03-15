# PinMediaSourceImagesURLItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** | Destination link for the image. | [optional] 
**Url** | **String** | URL of image to upload. | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImagesURLItemsInner = Initialize-PSOpenAPIToolsPinMediaSourceImagesURLItemsInner  -Title null `
 -Description null `
 -Link null `
 -Url null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImagesURLItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

