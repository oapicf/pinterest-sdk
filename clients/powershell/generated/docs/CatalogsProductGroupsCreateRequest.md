# CatalogsProductGroupsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** |  | 
**Description** | **String** |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to $false]
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group. | 
**CatalogType** | **String** |  | 
**CatalogId** | **String** | Catalog id pertaining to the hotel product group. | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsCreateRequest = Initialize-PSOpenAPIToolsCatalogsProductGroupsCreateRequest  -Name null `
 -Description null `
 -IsFeatured null `
 -Filters null `
 -FeedId 2680059592705 `
 -CatalogType null `
 -CatalogId 2680059592705
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

