# CatalogsProductGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group. | 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupCreateRequest = Initialize-PSOpenAPIToolsCatalogsProductGroupCreateRequest  -Description null `
 -FeedId 2680059592705 `
 -Filters null `
 -IsFeatured null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

