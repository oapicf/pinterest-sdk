# WWW::OpenAPIClient::Object::CatalogsRetailItemsBatch

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsRetailItemsBatch;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional] 
**created_time** | **DATE_TIME** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**completed_time** | **DATE_TIME** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**items** | [**ARRAY[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


