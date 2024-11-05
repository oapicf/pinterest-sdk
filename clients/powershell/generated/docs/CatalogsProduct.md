# CatalogsProduct
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Metadata** | [**CatalogsCreativeAssetsProductMetadata**](CatalogsCreativeAssetsProductMetadata.md) |  | 
**Pin** | [**Pin**](Pin.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProduct = Initialize-PSOpenAPIToolsCatalogsProduct  -CatalogType null `
 -Metadata null `
 -Pin null
```

- Convert the resource to JSON
```powershell
$CatalogsProduct | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

