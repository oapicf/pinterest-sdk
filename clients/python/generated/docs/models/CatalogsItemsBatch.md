# pinterestsdk.model.catalogs_items_batch.CatalogsItemsBatch

Object describing the catalogs items batch

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object describing the catalogs items batch | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[items](#items)** | list, tuple,  | tuple,  | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**batch_id** | str,  | str,  | Id of the catalogs items batch | [optional] 
**created_time** | str, datetime,  | str,  | Time of the batch creation: YYYY-MM-DD&#x27;T&#x27;hh:mm:ssTZD | [optional] value must conform to RFC-3339 date-time
**completed_time** | None, str, datetime,  | NoneClass, str,  | Time of the batch completion: YYYY-MM-DD&#x27;T&#x27;hh:mm:ssTZD | [optional] value must conform to RFC-3339 date-time
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# items

Array with the catalogs items processing records part of the catalogs items batch

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array with the catalogs items processing records part of the catalogs items batch | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ItemProcessingRecord**](ItemProcessingRecord.md) | [**ItemProcessingRecord**](ItemProcessingRecord.md) | [**ItemProcessingRecord**](ItemProcessingRecord.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

