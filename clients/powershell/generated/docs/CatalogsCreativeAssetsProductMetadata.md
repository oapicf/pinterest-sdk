# CatalogsCreativeAssetsProductMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **String** | The user-created unique ID that represents the creative assets item. | 
**Visibility** | [**CreativeAssetsVisibilityType**](CreativeAssetsVisibilityType.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsProductMetadata = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsProductMetadata  -CreativeAssetsId 123abc `
 -Visibility null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsProductMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

