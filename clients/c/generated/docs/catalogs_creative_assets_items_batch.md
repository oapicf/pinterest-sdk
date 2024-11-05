# catalogs_creative_assets_items_batch_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **char \*** | Id of the catalogs items batch | [optional] 
**created_time** | **char \*** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**completed_time** | **char \*** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**status** | **batch_operation_status_t \*** |  | [optional] 
**catalog_type** | **catalogs_type_t \*** |  | 
**items** | [**list_t**](creative_assets_processing_record.md) \* | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


