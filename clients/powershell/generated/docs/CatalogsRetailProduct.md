# CatalogsRetailProduct
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Metadata** | [**CatalogsRetailProductMetadata**](CatalogsRetailProductMetadata.md) |  | 
**Pin** | [**Pin**](Pin.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProduct = Initialize-PSOpenAPIToolsCatalogsRetailProduct  -CatalogType null `
 -Metadata null `
 -Pin null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProduct | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

