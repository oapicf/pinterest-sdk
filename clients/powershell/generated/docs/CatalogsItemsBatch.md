# CatalogsItemsBatch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**BatchId** | **String** | Id of the catalogs items batch | [optional] 
**CreatedTime** | **System.DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CompletedTime** | **System.DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**Status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**Items** | [**CreativeAssetsProcessingRecord[]**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsItemsBatch = Initialize-PSOpenAPIToolsCatalogsItemsBatch  -CatalogType null `
 -BatchId 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e `
 -CreatedTime null `
 -CompletedTime null `
 -Status null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsItemsBatch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

