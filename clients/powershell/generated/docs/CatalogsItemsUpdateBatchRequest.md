# CatalogsItemsUpdateBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**ItemUpdateBatchRecord[]**](ItemUpdateBatchRecord.md) | Array with catalogs items | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsUpdateBatchRequest = Initialize-PSOpenAPIToolsCatalogsItemsUpdateBatchRequest  -Country null `
 -Language null `
 -Operation null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsUpdateBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

