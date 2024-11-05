# CatalogsVerticalBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Items** | [**CatalogsCreativeAssetsBatchItem[]**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**CatalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsVerticalBatchRequest = Initialize-PSOpenAPIToolsCatalogsVerticalBatchRequest  -CatalogType null `
 -Country null `
 -Language null `
 -Items null `
 -CatalogId 2680059592705
```

- Convert the resource to JSON
```powershell
$CatalogsVerticalBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

