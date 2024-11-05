# CatalogsRetailProductGroupProductCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**InStock** | **Decimal** |  | 
**OutOfStock** | **Decimal** |  | 
**Preorder** | **Decimal** |  | 
**Total** | **Decimal** |  | 
**Videos** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductGroupProductCounts = Initialize-PSOpenAPIToolsCatalogsRetailProductGroupProductCounts  -CatalogType null `
 -InStock null `
 -OutOfStock null `
 -Preorder null `
 -Total null `
 -Videos null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductGroupProductCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

