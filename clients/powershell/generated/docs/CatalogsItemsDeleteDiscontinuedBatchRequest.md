# CatalogsItemsDeleteDiscontinuedBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Items** | [**ItemDeleteDiscontinuedBatchRecord[]**](ItemDeleteDiscontinuedBatchRecord.md) | Array with catalogs items | 
**Language** | **String** | We recommend using the CatalogsLocale values. | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsDeleteDiscontinuedBatchRequest = Initialize-PSOpenAPIToolsCatalogsItemsDeleteDiscontinuedBatchRequest  -Country null `
 -Items null `
 -Language null `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsDeleteDiscontinuedBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

