# openapi::CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **character** | Id of the catalogs items batch | [optional] 
**created_time** | **character** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**completed_time** | **character** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [Enum: ] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**items** | [**array[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 


