# openapi::CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **character** | Id of the catalogs items batch | [optional] [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**completed_time** | **character** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**created_time** | **character** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**items** | [**array[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [Enum: ] 


