# CatalogsRetailProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**Name** | **String** |  | 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the retail product group. | 
**Country** | [**Country**](Country.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsRetailProductGroupCreateRequest  -CatalogType null `
 -Name null `
 -Description null `
 -Filters null `
 -CatalogId 2680059592705 `
 -Country null `
 -Locale null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

