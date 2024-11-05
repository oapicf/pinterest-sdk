# CatalogsItemsDeleteBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**ItemDeleteBatchRecord[]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsDeleteBatchRequest = Initialize-PSOpenAPIToolsCatalogsItemsDeleteBatchRequest  -Country null `
 -Language null `
 -Operation null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsDeleteBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

