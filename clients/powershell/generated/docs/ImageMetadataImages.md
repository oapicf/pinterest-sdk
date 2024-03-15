# ImageMetadataImages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Var150x150** | [**ImageDetails**](.md) |  | [optional] 
**Var400x300** | [**ImageDetails**](.md) |  | [optional] 
**Var600x** | [**ImageDetails**](.md) |  | [optional] 
**Var1200x** | [**ImageDetails**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ImageMetadataImages = Initialize-PSOpenAPIToolsImageMetadataImages  -Var150x150 null `
 -Var400x300 null `
 -Var600x null `
 -Var1200x null
```

- Convert the resource to JSON
```powershell
$ImageMetadataImages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

