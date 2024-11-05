# CatalogsListProductsByFeedBasedFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **String** | Catalog Feed id pertaining to the catalog product group filter. | 
**Filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsListProductsByFeedBasedFilter = Initialize-PSOpenAPIToolsCatalogsListProductsByFeedBasedFilter  -FeedId 2680059592705 `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsListProductsByFeedBasedFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

