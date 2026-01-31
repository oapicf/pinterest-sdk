# CatalogsRetailItemsBatch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **String** | Id of the catalogs items batch | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CompletedTime** | **System.DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CreatedTime** | **System.DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | [readonly] 
**Items** | [**ItemProcessingRecord[]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**Status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemsBatch = Initialize-PSOpenAPIToolsCatalogsRetailItemsBatch  -BatchId 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e `
 -CatalogType null `
 -CompletedTime null `
 -CreatedTime null `
 -Items null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemsBatch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

