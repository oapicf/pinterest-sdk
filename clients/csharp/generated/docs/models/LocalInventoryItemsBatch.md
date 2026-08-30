# Org.OpenAPITools.Model.LocalInventoryItemsBatch
Unified model for local inventory items batch operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **string** | Id of the batch operation | [readonly] 
**CreatedTime** | **DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**OperationResults** | [**List&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**Status** | **SupplementalItemBatchOperationStatus** | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 
**CompletedTime** | **DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

