# CatalogsCreativeAssetsProduct
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Metadata** | [**CatalogsCreativeAssetsProductMetadata**](CatalogsCreativeAssetsProductMetadata.md) |  | 
**Pin** | [**Pin**](Pin.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsProduct = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsProduct  -CatalogType null `
 -Metadata null `
 -Pin null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsProduct | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

