# PinMediaWithImages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**ImageMetadata[]**](ImageMetadata.md) |  | [optional] 
**MediaType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinMediaWithImages = Initialize-PSOpenAPIToolsPinMediaWithImages  -Items null `
 -MediaType null
```

- Convert the resource to JSON
```powershell
$PinMediaWithImages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

