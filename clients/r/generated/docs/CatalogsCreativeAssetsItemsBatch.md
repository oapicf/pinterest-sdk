# openapi::CatalogsCreativeAssetsItemsBatch

Object describing the catalogs creative assets items batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **character** | Id of the catalogs items batch | [optional] 
**created_time** | **character** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**completed_time** | **character** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [Enum: ] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**items** | [**array[CreativeAssetsProcessingRecord]**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 


