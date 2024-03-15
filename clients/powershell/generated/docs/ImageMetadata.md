# ImageMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Images** | [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ImageMetadata = Initialize-PSOpenAPIToolsImageMetadata  -ItemType null `
 -Title null `
 -Description null `
 -Link null `
 -Images null
```

- Convert the resource to JSON
```powershell
$ImageMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

