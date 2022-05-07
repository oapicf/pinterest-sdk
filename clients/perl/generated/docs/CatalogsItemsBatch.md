# WWW::OpenAPIClient::Object::CatalogsItemsBatch

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsItemsBatch;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**ARRAY[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**batch_id** | **string** | Id of the catalogs items batch | [optional] 
**created_time** | **DateTime** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**completed_time** | **DateTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


