# PinMediaWithImages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaType** | **String** |  | [optional] 
**Items** | [**ImageMetadata[]**](ImageMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaWithImages = Initialize-PSOpenAPIToolsPinMediaWithImages  -MediaType null `
 -Items null
```

- Convert the resource to JSON
```powershell
$PinMediaWithImages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

