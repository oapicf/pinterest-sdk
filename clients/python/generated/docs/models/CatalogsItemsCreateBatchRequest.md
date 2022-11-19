# pinterestsdk.model.catalogs_items_create_batch_request.CatalogsItemsCreateBatchRequest

Request object to create catalogs items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object to create catalogs items | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) | [**Country**](Country.md) |  | 
**language** | [**Language**](Language.md) | [**Language**](Language.md) |  | 
**[items](#items)** | list, tuple,  | tuple,  | Array with catalogs items | 
**operation** | [**BatchOperation**](BatchOperation.md) | [**BatchOperation**](BatchOperation.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# items

Array with catalogs items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array with catalogs items | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ItemCreateBatchRecord**](ItemCreateBatchRecord.md) | [**ItemCreateBatchRecord**](ItemCreateBatchRecord.md) | [**ItemCreateBatchRecord**](ItemCreateBatchRecord.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

