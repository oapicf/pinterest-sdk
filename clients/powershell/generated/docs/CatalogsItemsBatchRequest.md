# CatalogsItemsBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**ItemDeleteBatchRecord[]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsBatchRequest = Initialize-PSOpenAPIToolsCatalogsItemsBatchRequest  -Country null `
 -Language null `
 -Operation null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

