# CatalogsItemsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsRequest = Initialize-PSOpenAPIToolsCatalogsItemsRequest  -Country null `
 -Language null `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

