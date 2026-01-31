# CatalogsRetailProductGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**Locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**Name** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductGroupUpdateRequest = Initialize-PSOpenAPIToolsCatalogsRetailProductGroupUpdateRequest  -CatalogType null `
 -Country null `
 -Description null `
 -Filters null `
 -Locale null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

