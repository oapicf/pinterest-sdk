# ImageSize
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Var1200x** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**Var150x150** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**Var400x300** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**Var600x** | [**ImageDetails**](ImageDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ImageSize = Initialize-PSOpenAPIToolsImageSize  -Var1200x null `
 -Var150x150 null `
 -Var400x300 null `
 -Var600x null
```

- Convert the resource to JSON
```powershell
$ImageSize | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

