# PinterestSdk.CatalogsRetailItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | Id of the catalogs items batch | [optional] 
**catalogType** | **String** |  | 
**completedTime** | **Date** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**createdTime** | **Date** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**items** | [**[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 



## Enum: CatalogTypeEnum


* `RETAIL` (value: `"RETAIL"`)




