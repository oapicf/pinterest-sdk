# SUPPLEMENTAL_ITEMS_BATCH_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | [**STRING_32**](STRING_32.md) | Id of the batch operation | [readonly] [default to null]
**completed_time** | [**DATE_TIME**](DATE_TIME.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**created_time** | [**DATE_TIME**](DATE_TIME.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] [default to null]
**operation_results** | [**LIST [SUPPLEMENTAL_OPERATION_RESULT]**](SupplementalOperationResult.md) | Array of operation results | [readonly] [default to null]
**status** | [**SUPPLEMENTAL_ITEM_BATCH_OPERATION_STATUS**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


