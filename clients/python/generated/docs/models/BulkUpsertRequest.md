# pinterestsdk.model.bulk_upsert_request.BulkUpsertRequest

Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**create** | [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) | [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) |  | [optional] 
**update** | [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) | [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

