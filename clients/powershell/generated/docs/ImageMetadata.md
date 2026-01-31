# ImageMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**ItemType** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ImageMetadata = Initialize-PSOpenAPIToolsImageMetadata  -Description null `
 -Images null `
 -ItemType null `
 -Link null `
 -Title null
```

- Convert the resource to JSON
```powershell
$ImageMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

