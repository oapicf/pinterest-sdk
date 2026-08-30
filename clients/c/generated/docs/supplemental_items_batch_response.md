# supplemental_items_batch_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **char \*** | Id of the batch operation | [readonly] 
**completed_time** | **char \*** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**created_time** | **char \*** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**operation_results** | [**list_t**](supplemental_operation_result.md) \* | Array of operation results | [readonly] 
**status** | **supplemental_item_batch_operation_status_t \*** | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


