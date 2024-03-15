# openapi::CatalogsItemsBatch

Object describing the catalogs items batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**batch_id** | **character** | Id of the catalogs items batch | [optional] 
**created_time** | **character** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**completed_time** | **character** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [Enum: ] 
**items** | [**array[HotelProcessingRecord]**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 


