# CatalogsItemsBatch

Object describing the catalogs items batch

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **[ItemProcessingRecord]** | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**batch_id** | **str** | Id of the catalogs items batch | [optional] 
**created_time** | **datetime** | Time of the batch creation: YYYY-MM-DD&#x27;T&#x27;hh:mm:ssTZD | [optional] [readonly] 
**completed_time** | **datetime, none_type** | Time of the batch completion: YYYY-MM-DD&#x27;T&#x27;hh:mm:ssTZD | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

