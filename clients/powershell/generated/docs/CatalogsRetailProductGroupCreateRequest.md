# CatalogsRetailProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the retail product group. | 
**CatalogType** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**Country** | [**Country**](Country.md) |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsRetailProductGroupCreateRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Description null `
 -Filters null `
 -Locale null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

