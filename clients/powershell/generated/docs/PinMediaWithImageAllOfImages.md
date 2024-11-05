# PinMediaWithImageAllOfImages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Var150x150** | [**SystemCollectionsHashtable**](.md) |  | [optional] 
**Var400x300** | [**SystemCollectionsHashtable**](.md) |  | [optional] 
**Var600x** | [**SystemCollectionsHashtable**](.md) |  | [optional] 
**Var1200x** | [**SystemCollectionsHashtable**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaWithImageAllOfImages = Initialize-PSOpenAPIToolsPinMediaWithImageAllOfImages  -Var150x150 null `
 -Var400x300 null `
 -Var600x null `
 -Var1200x null
```

- Convert the resource to JSON
```powershell
$PinMediaWithImageAllOfImages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

