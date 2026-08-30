# CatalogsRetailItemsBatch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **String** | Id of the catalogs items batch | [optional] 
**CatalogType** | **String** |  | 
**CompletedTime** | **System.DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**CreatedTime** | **System.DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**Items** | [**ItemProcessingRecord[]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**Status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemsBatch = Initialize-PSOpenAPIToolsCatalogsRetailItemsBatch  -BatchId 595953100599279259 `
 -CatalogType null `
 -CompletedTime 2024-01-01T20:20Z `
 -CreatedTime 2024-01-01T20:10:40Z `
 -Items null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemsBatch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

