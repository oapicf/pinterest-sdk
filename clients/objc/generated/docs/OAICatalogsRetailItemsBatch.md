# OAICatalogsRetailItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **NSString*** | Id of the catalogs items batch | [optional] 
**catalogType** | **NSString*** |  | 
**completedTime** | **NSDate*** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**createdTime** | **NSDate*** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**items** | [**NSArray&lt;OAIItemProcessingRecord&gt;***](OAIItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**OAIBatchOperationStatus***](OAIBatchOperationStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


