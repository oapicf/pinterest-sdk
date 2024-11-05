# CATALOGS_RETAIL_ITEMS_BATCH

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | [**STRING_32**](STRING_32.md) | Id of the catalogs items batch | [optional] [default to null]
**created_time** | [**DATE_TIME**](DATE_TIME.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**completed_time** | [**DATE_TIME**](DATE_TIME.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**status** | [**BATCH_OPERATION_STATUS**](BatchOperationStatus.md) |  | [optional] [default to null]
**catalog_type** | [**CATALOGS_TYPE**](CatalogsType.md) |  | [default to null]
**items** | [**LIST [ITEM_PROCESSING_RECORD]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


