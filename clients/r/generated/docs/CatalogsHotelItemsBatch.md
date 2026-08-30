# openapi::CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch. If specified, you must provide all properties.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **character** | Id of the catalogs items batch | [optional] [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**completed_time** | **character** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**created_time** | **character** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**items** | [**array[HotelProcessingRecord]**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [Enum: ] 


