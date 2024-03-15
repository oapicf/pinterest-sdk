# CatalogsRetailItemsBatch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **String** | Id of the catalogs items batch | [optional] 
**CreatedTime** | **System.DateTime** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**CompletedTime** | **System.DateTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**Status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Items** | [**ItemProcessingRecord[]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemsBatch = Initialize-PSOpenAPIToolsCatalogsRetailItemsBatch  -BatchId 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e `
 -CreatedTime 2020-01-01T20:10:40Z `
 -CompletedTime 2022-03-10T15:37:10Z `
 -Status null `
 -CatalogType null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemsBatch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

