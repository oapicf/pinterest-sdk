# PinMediaWithImage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaType** | **String** |  | [optional] 
**Images** | [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaWithImage = Initialize-PSOpenAPIToolsPinMediaWithImage  -MediaType null `
 -Images null
```

- Convert the resource to JSON
```powershell
$PinMediaWithImage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

