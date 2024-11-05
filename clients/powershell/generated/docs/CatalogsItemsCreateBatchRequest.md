# CatalogsItemsCreateBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**ItemCreateBatchRecord[]**](ItemCreateBatchRecord.md) | Array with catalogs items | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsCreateBatchRequest = Initialize-PSOpenAPIToolsCatalogsItemsCreateBatchRequest  -Country null `
 -Language null `
 -Operation null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsCreateBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

