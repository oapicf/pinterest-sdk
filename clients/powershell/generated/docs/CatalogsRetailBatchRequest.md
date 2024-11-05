# CatalogsRetailBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Items** | [**CatalogsRetailBatchRequestItemsInner[]**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailBatchRequest = Initialize-PSOpenAPIToolsCatalogsRetailBatchRequest  -CatalogType null `
 -Country null `
 -Language null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

